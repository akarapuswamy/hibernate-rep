<%@page import="model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<Student> st = (List<Student>)request.getAttribute("list");
%>>
<p> style="color: black" </p>
<%
String msg = (String) request.getAttribute("msg");
out.println(msg);
%>
<%
for(Student stu : st){
%>
<tr>
<tb><%=stu.getId()%></tb>
<tb><%=stu.getName() %></tb>
<tb><%=stu.getFee() %></tb>
<tb><%=stu.getEmail()%></tb>
<tb><a href="delete?id="<%=stu.getId()%>">delect</a></tb>
<a href="update?id= <%=stu.getId()%>">update</a></td>

</tr>

<% }%>

</body>
</html>