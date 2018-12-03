<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生列表</title>
</head>
<body>
	<br>
	<br>
	<br>
	<div class="container" align="center">
		<div class="row">
			<div class="col-md-12">
				<h1>葵花寶典 天下我有</h1>
			</div>
		</div>
		<br>
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover" id="emps_table">
					<thead>
						<tr>
							<th><input type="checkbox" id="check_all" /></th>
							<th>编号</th>
							<th>姓名</th>
							<th>性别</th>
							<th>电子邮箱</th>
							<th>联系电话</th>
							<th>班级</th>
							<th>操作</th>
						</tr>
					</thead>
					<c:forEach items="${list }" var="student">
						<tr>
							<td><input type='checkbox' class='check_item' /></td>
							<td>${student.id }</td>
							<td>${student.name }</td>
							<td>${student.gender }</td>
							<td>${student.email }</td>
							<td>${student.tel }</td>
							<td>${student.cla }</td>

							<td><a href="editstudent?id=${student.id }">编辑</a> 
							<a href="delete?id=${student.id }">删除</a>
								<form method="post" action="creat">
									<input name="name" value="" type="text"> <input
										type="submit" value="添加">
								</form></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
	
	<center>
		<p>当前 ${pageInfo.pageNum }页,总${pageInfo.pages } 页,总
			${pageInfo.total } 条记录
		</div>
		</p>
		<a href="list?pageNo=${pageInfo.firstPage}">第一页</a>
		<c:if test="${pageInfo.hasPreviousPage }">
			<a href="list?pageNo=${pageInfo.pageNum-1}">上一页</a>
		</c:if>

		<c:if test="${pageInfo.hasNextPage }">
			<a href="list?pageNo=${pageInfo.pageNum+1}">下一页</a>
		</c:if>

		<a href="list?pageNo=${pageInfo.lastPage}">最后页</a>
	</center>
	
</body>
</html>