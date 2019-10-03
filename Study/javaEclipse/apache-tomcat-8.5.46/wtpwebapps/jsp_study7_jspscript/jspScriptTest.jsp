<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%@include file="header.jsp" %>
<!-- 선언태그 -->
<%!
int num =1;
String name = "hello";

ArrayList<String> list = new ArrayList<String>();

public void jspMethod(){
	System.out.println("hello world");
	System.out.print(list);
	System.out.print(num);
}

%>

<!-- html 주석입니다. -->
<%-- JSP 주석입니다. --%>


<!-- 스크립트 태그  -->
<%
if(num >0){ 
%>
<p>num>0</p>
<%}else{ %>
<p>num<0</p>
<%
}
%>



<!-- 표현식 태그 -->
<p>num is<%=num %> </p>

<%@include file="footer.jsp" %>
</body>
</html>