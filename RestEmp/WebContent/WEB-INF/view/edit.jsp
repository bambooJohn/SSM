<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加新员工</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/index_work.css"/>
</head>
<body>
	<!-- modelAttribute自定义回显对象的属性名 -->
	<form:form action="${pageContext.request.contextPath}/emp" method="post" modelAttribute="emp">
		<c:if test="${empty emp.id }" var="flag"></c:if>
		<c:if test="${!flag}">
			<form:hidden path="id"/>
			<%-- <input name="id" value="${emp.id }"/> --%>
			<input type="hidden" name="_method" value="PUT"/>
		</c:if>
		
		<table>
			<tr>
				<!-- <th colspan="2">添加员工信息</th> -->
				<c:if test="${!flag}">
					<th colspan="2">修改员工信息</th>
				</c:if>
				<c:if test="${flag}">
					<th colspan="2">添加员工信息</th>
				</c:if>
			</tr>
			<tr>
				<td>LASTNAME</td>
				<%-- <td><input name="lastName" type="text" value="${emp.lastName }"/></td> --%>
				<td><form:input path="lastName"/></td>
			</tr>
			<tr>
				<td>EMAIL</td>
				<%-- <td><input name="email" type="text" value="${emp.email }"/></td> --%>
				<td><form:input path="email"/></td>
			</tr>
			<tr>
				<td>GENDER</td>
				<td>
					<%-- <input type="radio" name="gender" value="1" checked=${emp.gender == 1 ? 'checked' : ''}/>男
					<input type="radio" name="gender" value="0" checked=${emp.gender == 0 ? 'checked' : ''}/>女 --%>
					<%-- <form:radiobutton path="gender" value="1"/>男
					<form:radiobutton path="gender" value="0"/>女 --%>
					<form:radiobuttons path="gender" items="${genders }"/>
				</td>
			</tr>
			<tr>
				<td>DEPARTMENT</td>
				<td>
					<%-- <select name="department.id">
						<option>-SELECT DEPARMENT-</option>
						<c:forEach items="${depts }" var="dept">
							<option value="${dept.id }" ${dept.id==emp.department.id ? 'selected' : ''}>${dept.departmentName }</option>
						</c:forEach>
					</select> --%>
					<!-- 
					items="":指定要遍历的集合，自动遍历，遍历出的每一个元素是一个department对象
					itemLabel="属性名":指定遍历出的这个对象的哪个属性是作为option标签体的值
					itemValue="属性名":指定刚才遍历出来的这个对象的哪个属性是作为要提交的value值
					 -->
					<form:select path="department.id" items="${depts }" itemLabel="departmentName" itemValue="id"></form:select>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<!-- <input type="submit" value="添加"/> -->
					<c:if test="${!empty emp.id }">
						<input type="submit" value="修改"/>
					</c:if>
					<c:if test="${empty emp.id }">
						<input type="submit" value="添加"/>
					</c:if>
				</td>
			</tr>
		</table>
	</form:form>

</body>
</html>