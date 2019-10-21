package com.liuqirui.service;

import com.liuqirui.pojo.User;

public interface UserService {

	//登录
	public User doLogin(String username,String address);
}
