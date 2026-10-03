<%@page import="com.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% Student s=(Student)request.getAttribute("std"); %>
<table border="2px">
<tr>
<th>ID</th>
<th>Name</th>
</tr>
<tr>
<td><%=s.id %></td>
<td><%=s.name %></td>
</tr>
</table>
</body>
</html>