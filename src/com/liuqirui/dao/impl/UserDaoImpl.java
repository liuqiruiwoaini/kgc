package com.liuqirui.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.liuqirui.dao.UserDao;
import com.liuqirui.pojo.User;
import com.liuqirui.utils.JDBCUtil;

public class UserDaoImpl implements UserDao{
	
	//引入数据源
	private QueryRunner qr = new QueryRunner(JDBCUtil.getDataSource());

	@Override
	public User selectUserByUserName(String userName) {
		
		try {
			User user = null;
			String sql = "SELECT * FROM USER u WHERE u.username = ?";
			Object[] params = {userName};
			user = qr.query(sql, new BeanHandler<User>(User.class),params);
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
