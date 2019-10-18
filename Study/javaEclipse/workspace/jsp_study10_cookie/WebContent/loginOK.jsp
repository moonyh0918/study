<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
Cookie[] cookies = request.getCookies();
for(Cookie c : cookies){
	out.print("<p>name : " + c.getName()+"<br>");
	out.print("<p>value : "+ c.getValue()+"<br>");
	out.print("---------------------------------------");
	out.print("<p>name : " + c.getValue()+"<br>");
}
%>
</body>
</html>