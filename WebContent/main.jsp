<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script src="static/js/jquery-1.9.1.js"></script>
</head>
<body>

						<select id = "utype2" name="utype2">
                            <option value="0">请选择</option>
                            <c:forEach items="${userTypeList}" var="type">
			   						<option value="${type.id}">${type.persontype}</option>
			   				 </c:forEach> 
                        </select>
                        用户名：<input type="text" id="userName" name="userName" />
		用户地址：<input type="text" id="address" name="address" />
		<input type="button" value="登录" onclick="denglu()" />		
</body>

<script type="text/javascript">
	function denglu(){
		var userName = $("#userName").val();
		var address = $("#address").val();
		if(userName ==null || userName == "" ){
			alert("请输入用户名！");
			return false;
		}else if(address == null || address == ""){
			alert("请输入用户地址!");
			return false;
		}else{
			$.ajax({
				url: "UserServlet",
				type: "get",
				data:{
					"userName" : userName,
					"address" : address
				},
				dataType: "text",
				success: function(data){
					if(data != null && data == "success"){
						window.location.href = "index.jsp";
					}else if(data == null || data == "fail"){
						alert("账号或者密码不正确！");
					}
				}
			});
		}
	}
</script>
</html>