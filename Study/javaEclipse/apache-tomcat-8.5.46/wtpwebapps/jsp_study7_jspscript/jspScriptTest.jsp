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
<!-- �����±� -->
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

<!-- html �ּ��Դϴ�. -->
<%-- JSP �ּ��Դϴ�. --%>


<!-- ��ũ��Ʈ �±�  -->
<%
if(num >0){ 
%>
<p>num>0</p>
<%}else{ %>
<p>num<0</p>
<%
}
%>



<!-- ǥ���� �±� -->
<p>num is<%=num %> </p>

<%@include file="footer.jsp" %>
</body>
</html>