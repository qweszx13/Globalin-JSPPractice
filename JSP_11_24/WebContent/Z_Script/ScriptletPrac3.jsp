<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	int i = 10;
	String str = "abc";
%>

<%!
	public int sum(int a,int b){
		return a+b;
	}
%>

<%= i %>
<%= str %>
<%= sum(1,5) %>


</body>
</html>