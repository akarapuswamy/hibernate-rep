<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>scriptlet Element</h1>
<% int x=10;
out.print(x);

int i = 0;
for(i=1;i<=10;i++){
	out.print("<br><h3>swamy"+i+"</h3>");
}
if(i<=25){
	out.print("i greater than 30");
}else{
	out.print("i less than 25");
}


%>

</body>
</html>