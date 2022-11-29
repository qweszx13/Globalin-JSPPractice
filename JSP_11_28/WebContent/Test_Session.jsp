<!-- session_set.jsp 파일에 대하여 session get 를 클릭하면 모든 세션 값을 
출력하는 session_get.jsp를 만드시오.session_set.jsp -->

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
        session.setAttribute("sessionName","sessionValue");
        session.setAttribute("myNum",12345);
%>

<a href="Test_Session_get.jsp">session get</a>
        
</body>
</html>