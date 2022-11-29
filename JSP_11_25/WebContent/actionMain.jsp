<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>main페이지 입니다</h1>
	<jsp:forward page="actionSub.jsp"/>
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
	%>
	id : <%= id %><br>
	pw : <%= pw %><br>

</body>
</html>