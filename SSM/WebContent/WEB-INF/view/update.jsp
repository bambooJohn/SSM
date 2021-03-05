<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/index_work.css"></link>
<title>修改员工信息</title>
</head>
<body>

	<form:form action="${pageContext.servletContext.contextPath }/emp" method="post" modelAttribute="emp">
		<form:hidden path="eid"/>
		<input type="hidden" name="_method" value="PUT"/>
		<table>
			<tr>
				<td colspan="2">修改员工信息</td>
			</tr>
			<tr>
				<td>ENAME</td>
				<td><form:input path="ename"/></td>
			</tr>
			<tr>
				<td>AGE</td>
				<td><form:input path="age"/></td>
			</tr>
			<tr>
				<td>SEX</td>
				<td>
					<form:radiobuttons path="sex" items="${sexs }"/>
				</td>
			</tr>
			<tr>
				<td>DEPARTMENT</td>
				<td>
					<form:select path="dept.did" items="${depts }" itemLabel="dname" itemValue="did"/>
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="修改"/></td>
			</tr>
		</table>
	</form:form>

</body>
</html>