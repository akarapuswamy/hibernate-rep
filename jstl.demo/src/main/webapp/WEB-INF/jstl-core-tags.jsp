<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>scriplet tag</h2>
	<%
	int b = 10;
	out.println(b);

	if (b > 0) {
		out.println("postive");
	} else if (b < 0) {
		out.println("negative");
	} else {
		out.println("equal to zero");
	}
	%>

<c:set var="x" value="5"></c:set>
	<c:if test="${x==5}">
		<h5>
			<c:out value="${a}"></c:out>
			x is equal to 5
		</h5>
	</c:if>

	<h3>jstl core tags</h3>
	<c:set var="a" value="10"></c:set>

	<p>
		<c:out value="${a}">
		</c:out>
	</p>

	<h4>jstl core tag of conditon</h4>

	<c:choose>
		<c:when test="${a>0}">
			<h5>
				<c:out value="${a}"></c:out>
				a is positive
			</h5>

		</c:when>

		<c:when test="${a<0}">
			<h5>
				<c:out value="${a}"></c:out>
				a is negative
			</h5>

		</c:when>

		<c:otherwise>
			<h5>
				<c:out value="${a}"></c:out>
				a is equal to zero
			</h5>

		</c:otherwise>

	</c:choose>



	<h4>jstl core tag forloop</h4>

	<c:forEach var="i" begin="1" end="5">

		<c:out value="${i}"></c:out>
		<br>
	</c:forEach>

</body>
</html>