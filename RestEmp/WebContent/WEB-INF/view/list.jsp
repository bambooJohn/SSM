<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工信息列表</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/index_work.css"/>
</head>
<body>

	<table>
		<tr>
			<th>ID</th>
			<th>LASTNAME</th>
			<th>EMAIL</th>
			<th>GENDER</th>
			<th>DEPARTMENT</th>
			<th>OPTION(<a href="emp">ADD</a>)</th>
		</tr>
		<c:forEach items="${emps }" var="emp">
			<tr>
				<td>${emp.id }</td>
				<td>${emp.lastName }</td>
				<td>${emp.email }</td>
				<td>${emp.gender == 0 ? '女' : '男' }</td>
				<td>${emp.department.departmentName }</td>
				<td>
					<a href="emp">UPDATE</a>
					<a href="emp">DELETE</a>
				</td>
			</tr>
		</c:forEach>
		
		
	</table>

</body>
</html>