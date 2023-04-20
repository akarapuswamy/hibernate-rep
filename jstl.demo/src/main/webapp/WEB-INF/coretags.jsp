%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>mapping list with jstl tags</h3>

	<%-- 	<c:forEach var="name" items="${names}"> --%>

	<%-- 		<c:out value="${name}"></c:out> --%>
	<!-- 		<br> -->
	<%-- 	</c:forEach> --%>

	<c:forEach var="student" items="${students}">

		<c:out value="${student.id}"></c:out><br>
		<c:out value="${student.name}"></c:out><br>
		<c:out value="${student.fee}"></c:out><br>
		<c:out value="${student.email}"></c:out>
	</c:forEach>

</body>
</html>