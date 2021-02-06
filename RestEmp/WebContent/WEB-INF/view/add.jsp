<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加新员工</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/index_work.css"/>
</head>
<body>

	<form action="emp" method="post">
		<table>
			<tr>
				<th colspan="2">添加员工信息</th>
			</tr>
			<tr>
				<td>LASTNAME</td>
				<td><input name="lastName" type="text"/></td>
			</tr>
			<tr>
				<td>EMAIL</td>
				<td><input name="email" type="text"/></td>
			</tr>
			<tr>
				<td>GENDER</td>
				<td>
					<input type="radio" name="gender" value="1">男
					<input type="radio" name="gender" value="0">女
				</td>
			</tr>
			<tr>
				<td>DEPARTMENT</td>
				<td>
					<select name="department.id">
						<option>-SELECT DEPARMENT-</option>
						<c:forEach items="${depts }" var="dept">
							<option value="${dept.id }">${dept.departmentName }</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="添加"></>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>