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
	Cookie[] cookie = request.getCookies();

	for(int i=0;i<cookie.length;i++){
		String srg = cookie[i].getName();
		if(srg.equals("CookieN")){
			out.println(cookie[i].getName());
			out.println(cookie[i].getValue());
			out.println(cookie[i].getPath());
		}
			
	}

%>

</body>
</html>