<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		String str = request.getParameter("age");
		int age = Integer.valueOf(str);
		
	%>
	<jsp:forward page="actionMain.jsp">
		<jsp:param value="abcd" name="id"/>
		<jsp:param value="1234" name="pw"/>
	</jsp:forward>

</body>
</html>