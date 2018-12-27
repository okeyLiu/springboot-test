package com.okliu.springboot.service;

import java.util.List;

import com.okliu.springboot.entity.Clazz;

public interface ClazzService {
	
	/**
	  * ��ȡ����
	 * @return
	 */
	List<Clazz> findAll();
	
	/**
	  * ����id�Ұ༶
	 * @param id
	 * @return
	 */
	Clazz findById(Integer id);
	
	/**
	  * ��Ӱ༶
	 * @param clazz
	 */
	boolean add(Clazz clazz);
	
	/**
	  * ����id����ɾ��
	 * @param id
	 * @return
	 */
	boolean deleteById(Integer id);
	
	/**
	  * �޸İ༶��Ϣ
	 * @param clazz
	 * @return
	 */
	boolean edit(Clazz clazz);
}
