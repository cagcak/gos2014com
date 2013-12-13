<%--
  Created by Çağrı in 11.12.2013 at 19:23
--%>
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="ISO-8859-1"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>IAAUMAS | Secure Area</title>
</head>
<body>
<h3>Secure Area Main Page</h3>
<h3>Welcome <jsec:principal /></h3>
<p>
    <a href="<c:url value='/index.jsp' />">Home</a>
        <shiro:hasRole name="admin">
  | <a href="<c:url value='/admin/users.jsp' />"> Admin Area </a>
        </shiro:hasRole>
  | <a href="<c:url value='/LogoutUser' />">Log Out</a>
</p>
</body>
</html>
