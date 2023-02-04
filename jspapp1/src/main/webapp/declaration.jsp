<%@page import="com.ciq.demo.Demo"%>
<%@page import="com.sun.tools.javac.Main"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Declarative element</h1>
<%!
public String msg(String data){
	return data.toUpperCase();
}
int x=30;
%>
<% 
 out.print(msg("welcome to Declarative Elements "));
 out.println("<br>"+x);
%>
<%="my name	 is swamy" %>>


<%=com.ciq.demo.Demo.getintance() %>>
</body>
</html>