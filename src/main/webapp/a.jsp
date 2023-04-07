<%@page import="dto.emp"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2px">
<tr>
<th>name</th>
<th>role</th>
<th>email</th>
<th>role</th>
</tr>
<%List<emp>l1=(List<emp>)request.getAttribute("d"); %>
<%for(emp j:l1)
	{
	%>
	<tr>
	<td><%=j.getName() %></td>
	<td><%=j.getRole() %></td>
	<td><%=j.getEmail() %></td>
	<td><%=j.getPassword() %></td>
	</tr>
	<%} %>
</table>

</body>
</html>