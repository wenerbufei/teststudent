<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style type="text/css">
        body {
            text-align: center;
            padding-bottom: 0px;
            background-color: #ddeef2;
            margin: 0px;
            padding-left: 0px;
            padding-right: 0px;
            padding-top: 0px
        }
</style>

</head>
<body>

	<div align="center">
		<form action="register" method="post">
			用户名：<input name="username"><br /> 
			密码：<input type="password" name="password"><br />
			 重复密码：<input type="password"name="password"><br />
			  <input type="submit" value="注册">
			&nbsp;&nbsp;&nbsp; <a href="/ssmstudent/login.jsp"><input
				type="button" value="登录" /></a>
		</form>
	</div>

</body>
</html>