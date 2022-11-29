<%@page import="java.util.Enumeration"%>
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

	Enumeration enumer = session.getAttributeNames();
	
	int i = 0;

	while(enumer.hasMoreElements()){
		i++;
		String sName = enumer.nextElement().toString();
		String num = (String)session.getAttribute(sName).toString();
		out.println(sName);
		out.println(num);

	}
	

%>

</body>
</html>