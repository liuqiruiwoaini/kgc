package com.liuqirui.service.impl;

import com.liuqirui.dao.UserDao;
import com.liuqirui.dao.impl.UserDaoImpl;
import com.liuqirui.pojo.User;
import com.liuqirui.service.UserService;

public class UserServiceImpl implements UserService{
	
	private UserDao ud = new UserDaoImpl();

	@Override
	public User doLogin(String username, String address) {
		User user = ud.selectUserByUserName(username);
		if(user != null) {
			if(!address.equals(user.getAddress())) {
				return null;
			}
		}
		return user;
	}

}
