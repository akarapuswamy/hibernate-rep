<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
<% String FirstName=request.getParameter("FirstName"); 
  String lastName=request.getParameter("lastName");
  String COUNTRY=request.getParameter("COUNTRY");
  String Language=request.getParameter("Language");
  out.println(FirstName+""+lastName+""+COUNTRY+""+Language); 
%>>


</body>
</html>