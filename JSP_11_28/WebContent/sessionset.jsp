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

<%//세션도 (Key,Value)형태지만 오브젝트도 보낼수있다. 세션은 내장객체
	session.setAttribute("id","1234");
	session.setAttribute("pw",1234);
	
	Enumeration enumeration = session.getAttributeNames();
	
	int i = 0;
	while(enumeration.hasMoreElements()){//전체요소 접근시에는 enumeration 사용해야함.
		i++;
		String sName = enumeration.nextElement().toString();
		String sValue = (String)session.getAttribute(sName).toString();
		
		out.println("sName : "+sName+"<br />");
		out.println("sValue : "+sValue+"<br />");
	}
   String sessionID = session.getId();//세션아이디 중
   out.println("sessionID : " + sessionID + "<br />");
   int sessionInter =  session.getMaxInactiveInterval();
   out.println("sessionInter : " + sessionInter + "<br />");
   
   
   session.invalidate();
	
	session.removeAttribute("id");//remove
%>

	<a href="sessionget.jsp">Go to Session get</a>

</body>
</html>