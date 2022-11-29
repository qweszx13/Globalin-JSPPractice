<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%//세션도 (Key,Value)형태지만 오브젝트도 보낼수있다. 세션은 내장객체
	String id = (String)session.getAttribute("id");
	int pw = (Integer)session.getAttribute("pw");
%>
	id: <%= id%><br/>
	pw: <%= pw%><br/>
	<a href="sessionget.jsp">cookie</a>

</body>
</html>