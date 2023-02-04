<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>APPLICTION FROM</h1>

<from action="Student-response.jsp">
FirstName:<input type="text" name="firstname"><br><br>
lastName:<input type="text" name="lastname"><br><br>
Select Country:
<select name="COUNTRY">
<option>india</option>
<option>USA</option>
<option>Russia</option>
<option>Canada</option>
</select>
<br><br>

Choose Favouriate Language:
<input type="checkbox" name="fl" value="java">java
<input type="checkbox" name="fl" value="pythan">java
<input type="checkbox" name="fl" value="angular">angular
<input type="checkbox" name="fl" value="Plsql">Plsql
<br><br>

<input type="submit" value="submit">



</from>

</body>
</html>