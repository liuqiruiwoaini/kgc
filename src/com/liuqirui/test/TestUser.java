package com.liuqirui.test;

import java.util.List;

import org.junit.Test;

import com.liuqirui.dao.UserTypeDao;
import com.liuqirui.dao.impl.UserTypeDaoImpl;
import com.liuqirui.pojo.User;
import com.liuqirui.pojo.UserType;
import com.liuqirui.service.UserService;
import com.liuqirui.service.impl.UserServiceImpl;

public class TestUser {

	private UserTypeDao utd = new UserTypeDaoImpl();
	private UserService us = new UserServiceImpl();
	
	@Test
	public void ttttt() {
		System.out.println("999999999999999999");
	}
	
	
	
//	@Test
//	public void testDoLogin() {
//		User user = us.doLogin("鍒樺鐟�", "婀栧崡鐪佺殑鏌愪釜鍦版柟");
//		if(user != null) {
//			System.out.println(user);
//		}
//	}
//	
//	
//	@Test
//	public void testSelectAllUserType() {
//		List<UserType> userTypeList = utd.selectAllUserType();
//		if(userTypeList != null){
//			for (UserType userType : userTypeList) {
//				System.out.println("濮撳悕锛�"+userType.getPersontype());
//			}
//		}else {
//			System.out.println("绯荤粺寮傚父锛�");
//		}
//	}
	
}
