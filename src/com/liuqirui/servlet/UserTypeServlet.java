package com.liuqirui.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liuqirui.pojo.UserType;
import com.liuqirui.service.UserTypeService;
import com.liuqirui.service.impl.UserTypeServiceImpl;

@WebServlet("/UserTypeServlet")
public class UserTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserTypeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		UserTypeService uts = new UserTypeServiceImpl();
		List<UserType> userTypeList = uts.findAllUserType();
		if(userTypeList != null) {
			//查询出来的值存放在request
			request.setAttribute("userTypeList", userTypeList);
			//存进去之后跳转页面
			request.getRequestDispatcher("main.jsp").forward(request, response);
		}else {
			System.out.println("系统异常！");
		}
		
	
	
	}

}
