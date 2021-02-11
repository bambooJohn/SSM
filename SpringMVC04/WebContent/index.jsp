<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			$.ajax({
				url:"testJson",
				type:"POST",
				dataType:"json",
				success:function(msg){
					/* 
					[{"id":1001,"lastName":"E-AA","email":"aa@163.com","gender":1,"department":{"id":101,"departmentName":"D-AA"}},
						{"id":1002,"lastName":"E-BB","email":"bb@163.com","gender":1,"department":{"id":102,"departmentName":"D-BB"}},
						{"id":1003,"lastName":"E-CC","email":"cc@163.com","gender":0,"department":{"id":103,"departmentName":"D-CC"}},
						{"id":1004,"lastName":"E-DD","email":"dd@163.com","gender":0,"department":{"id":104,"departmentName":"D-DD"}},
						{"id":1005,"lastName":"E-EE","email":"ee@163.com","gender":1,"department":{"id":105,"departmentName":"D-EE"}}]
					*/
					for(var i in msg){
						var emp = msg[i];
						alert("id:" + emp.id + ",lastName:" + emp.lastName + ",email:" + emp.email + ",gender:" + emp.gender + ",department:" +  emp.department.departmentName);
					} 
					//alert(msg)
				}
			});
		});
	});
</script>
</head>
<body>

	<input id="btn" type="button" value="测试ajax"/>

	<a href="${pageContext.servletContext.contextPath}/testJson">测试Json</a>

</body>
</html>