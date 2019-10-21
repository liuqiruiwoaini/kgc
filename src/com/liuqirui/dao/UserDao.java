package com.liuqirui.dao;

import com.liuqirui.pojo.User;

public interface UserDao {
	
	//登录 根据用户名 查找 User
	public User selectUserByUserName(String userName);

}
