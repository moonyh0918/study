<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%!String m_name;
	String m_password;
	String[] m_hobby;%>

	<%
m_name = request.getParameter("m_name");
m_password = request.getParameter("m_password");
m_hobby= request.getParameterValues("m_hobby");
%>

	m_name =
	<%= m_name %><br> m_pass =
	<%= m_password %><br> m_name =
	<%
for(int i =0; i<m_hobby.length; i++){
%>
	<%=m_hobby[i] %>
	<%
} 
%><br>

<%
Enumeration<String> names = request.getAttributeNames();
while (names.hasMoreElements()) {
	String name = (String) names.nextElement();
	System.out.println("name : " + name);
}
%>
</body>
</html>