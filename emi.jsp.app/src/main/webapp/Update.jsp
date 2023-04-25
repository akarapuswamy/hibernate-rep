<%@page import="model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>
		<%
		Student student = (Student) request.getAttribute("student");
		%>
	</p>

	<form action="update" method="post">
		<table>
			<tr>
				<td>id:</td>
				<td><input type="text" name="id" readonly="readonly"
					value="<%=student.getId()%>"></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name"
					value="<%=student.getName()%>"></td>
			</tr>
			<tr>
				<td>Fee:</td>
				<td><input type="text" name="fee" value="<%=student.getFee()%>"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email"
					value="<%=student.getEmail()%>"></td>
			</tr>
			<tr>
				<td><input type="submit" value="update"></td>
			</tr>


		</table>

	</form>

</body>
</html>