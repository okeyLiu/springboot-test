package com.okliu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {

	@RequestMapping("/hellojsp")
	public String hello() {
//		return "/WEB-INF/jsp/hello.jsp";
		return "hello";
	}
	
}
