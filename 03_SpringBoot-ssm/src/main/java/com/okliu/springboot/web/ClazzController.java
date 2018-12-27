package com.okliu.springboot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.okliu.springboot.dto.Result;
import com.okliu.springboot.entity.Clazz;
import com.okliu.springboot.exception.ClazzException;
import com.okliu.springboot.service.ClazzService;

@RequestMapping(value= {"/class","/clazz"})
@Controller
public class ClazzController {
	
	@Autowired 
	private ClazzService clazzService;
	
	@ResponseBody
	@RequestMapping("/list/json")
	public Result<List<Clazz>> listJson(){
		return new Result<List<Clazz>>(true, clazzService.findAll());
	}
	
	@ResponseBody
	@RequestMapping("/get/{clazzId}/json")
	public Result<Clazz> getJson(@PathVariable Integer clazzId){
		Result<Clazz> result = new Result<Clazz>();
		Clazz clazz = clazzService.findById(clazzId);
		if(clazz == null) {
			result.setSuccess(false);
			result.setError("id²»´æÔÚ");
		}else {
			result.setSuccess(true);
			result.setData(clazz);
		}
		return result;
	}
	
	@RequestMapping("/get/{clazzId}")
	public ModelAndView get(@PathVariable Integer clazzId){
		ModelAndView mav = new ModelAndView("clazz_detail");
		Clazz clazz = clazzService.findById(clazzId);
		mav.addObject("clazz", clazz);
		return mav;
	}
	

	@RequestMapping("/edit")
	public String edit(Clazz clazz,Model model){
		if(clazzService.edit(clazz)) {
			return "redirect:/class/list";
		} else {
			model.addAttribute("msg", "±à¼­Ê§°Ü");
			return "clazz_detail";
		}
	}
	
	@RequestMapping("/list")
	public ModelAndView list(){
		ModelAndView mav = new ModelAndView("clazz_list");
		List<Clazz> list = clazzService.findAll();
		mav.addObject("classes", list);
		return mav;
	}
	
	@RequestMapping("/delete/{clazzId}")
	public String delete(@PathVariable Integer clazzId,Model model){
		if(clazzService.deleteById(clazzId)) {
			model.addAttribute("msg", "É¾³ý³É¹¦");
		} else {
			model.addAttribute("msg", "É¾³ýÊ§°Ü");
		}
		return "redirect:/class/list";
	}
	
	@RequestMapping("/toAdd")
	public String toAdd() {
		return "add_class";
	}
	
	@PostMapping("/add")
	public String add(Clazz clazz,Model model) {
		try {
			clazzService.add(clazz);
		} catch (ClazzException e) {
			System.out.println(e);
			model.addAttribute("msg", 
					e.getMessage());
			return "forward:/class/toAdd";
		}
		return "forward:/class/list";
	}
}
