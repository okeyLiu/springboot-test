package com.okliu.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.okliu.springboot.dao.ClazzDao;
import com.okliu.springboot.entity.Clazz;
import com.okliu.springboot.exception.ClazzException;
import com.okliu.springboot.service.ClazzService;

@Service
public class ClazzServiceImpl implements ClazzService {

	@Autowired
	private ClazzDao clazzDao;
	
	@Override
	public List<Clazz> findAll() {
		return clazzDao.selectAll();
	}

	@Override
	public Clazz findById(Integer id) {
		return clazzDao.selectByPrimaryKey(id);
	}

	@Override
	public boolean add(Clazz clazz) {
		if(clazz.getName().length() == 0 ||
			clazz.getClassteacher().length()==0 ||
			clazz.getLecturer().length()==0) {
			throw new ClazzException("�༶��Ϣ����Ϊ��");
		}
		return clazzDao.insert(clazz) == 1;
	}

	@Override
	public boolean deleteById(Integer id) {
		return clazzDao.deleteByPrimaryKey(id) == 1;
	}

	@Override
	public boolean edit(Clazz clazz) {
		return clazzDao.updateByPrimaryKeySelective(clazz) == 1;
	}

}
