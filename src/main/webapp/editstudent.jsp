<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="width: 500px; margin: 0px auto; text-align: center">


		<div style="text-align: center; margin-top: 40px">

			<form method="post" action="updatestudent">
				name： &nbsp; <input name="name" value="${c.name}" type="text"
					size="18"> <br> gender： &nbsp; <input name="gender"
					value="${c.gender}" type="text" size="18"><br> email：
				<input name="email" value="${c.email}" type="text" size="18"><br>
				phone： <input name="tel" value="${c.tel}" type="text" size="18"><br>
				cla： <input name="cla" value="${c.cla}" type="text" size="18"><br>
				id ： &nbsp;&nbsp; <input type="" value="${c.id}" name="id" size="18">
				<br> <input type="submit" value="修改">
			</form>

		</div>
	</div>
</body>
</html>