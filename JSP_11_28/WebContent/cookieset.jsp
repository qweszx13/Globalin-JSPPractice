<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%//String 형태 Only
	Cookie cookie = new Cookie("cookieN","cookieV");
	cookie.setMaxAge(60*60);
	
	response.addCookie(cookie);
%>
	<a href="cookieget.jsp">cookie</a>

</body>
</html>