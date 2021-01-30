<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<a href="testREST/1001">测试GET</a>

	<br/>
	<form action="testREST" method="POST">
		<input type="submit" value="测试POST"/>
	</form>
	<br/>
	<form action="testREST" method="POST">
		<input type="hidden" name="_method" value="PUT"/>
		<input type="submit" value="测试PUT"/>
	</form>
	
	<form action="testREST/1001" method="POST">
		<input type="hidden" name="_method" value="DELETE"/>
		<input type="submit" value="测试DELETE"/>
	</form>

</body>
</html>