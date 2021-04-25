<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="java.time.*" %>
    <%@page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
<h1>This is help</h1>

<%-- <% String n=(String)request.getAttribute("name");
Integer i=(Integer)request.getAttribute("id");
LocalDateTime t=(LocalDateTime)request.getAttribute("time");
%> --%>
<h1>Name is : <%-- <%=n %> --%>  ${name}</h1>
<h1>ID is : <%-- <%=i %> --%>  ${id}  </h1>
<h1>Time is : <%-- <%=t %> --%>   ${time}   </h1>
<hr>

<h1>${marks}</h1>

</body>
</html>