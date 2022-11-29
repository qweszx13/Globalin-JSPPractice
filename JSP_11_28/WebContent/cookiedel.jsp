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
	Cookie[] cookies = request.getCookies();

	for(int i=0;i<cookies.length;i++){
		String str = cookies[i].getName();
		if(str.equals("cookieN")){
			out.println("cookies["+ i +"] name :"+cookies[i].getName()+"<br />");
			out.println("cookies["+ i +"] value :"+cookies[i].getValue()+"<br />");
			out.println("============================<br />");
			
			cookies[i].setMaxAge(0);//-> 삭제,시간결정
			response.addCookie(cookies[i]);
		}
	}
%>
	<!-- <a href="cookieget.jsp">cookie get</a> -->
	<a>here is DelPage</a>
	<a href="cookieset.jsp">cookie go to set</a>

</body>
</html>