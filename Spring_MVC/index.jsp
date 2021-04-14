<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1> This is Home Page </h1>
<h1> From index inside views folder ########### </h1>


<%
String n=(String)request.getAttribute("name");
Integer id=(Integer)request.getAttribute("ID");
List<String> al=(List<String>)request.getAttribute("AL");
%>


<h1> Name is : <%=n %></h1>
<h1> ID is : <%=id %></h1>
<h1>List has:</h1>

<%
for(String a:al)
{ %>
	<h1> <%=a %> </h1>
<%  }
%>


</body>
</html>