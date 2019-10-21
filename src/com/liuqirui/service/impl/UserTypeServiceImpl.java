package com.liuqirui.service.impl;

import java.util.List;

import com.liuqirui.dao.UserTypeDao;
import com.liuqirui.dao.impl.UserTypeDaoImpl;
import com.liuqirui.pojo.UserType;
import com.liuqirui.service.UserTypeService;

public class UserTypeServiceImpl implements UserTypeService{
	
	//Service 做业务处理
	private UserTypeDao utd = new UserTypeDaoImpl();

	@Override
	public List<UserType> findAllUserType() {
		return utd.selectAllUserType();
	}

}
