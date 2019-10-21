package com.liuqirui.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.liuqirui.dao.UserTypeDao;
import com.liuqirui.pojo.UserType;
import com.liuqirui.utils.JDBCUtil;

public class UserTypeDaoImpl implements UserTypeDao{
	
	//DAO层 访问数据
	private QueryRunner qr = new QueryRunner(JDBCUtil.getDataSource());

	@Override
	public List<UserType> selectAllUserType() {
		try {
			List<UserType> userTypeList= null;
			//1.定义sql语句
			String sql = "SELECT id, persontype FROM usertype ";
			//2.看sql语句中是否有参数
			//3.确定你的qr 方法
			userTypeList = qr.query(sql, new BeanListHandler<UserType>(UserType.class));
			//4.确定返回值
			return userTypeList;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
