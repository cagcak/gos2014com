<%--
  Created by Çağrı in 11.12.2013 at 19:41
--%>
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>IAAUMAS | Admin Console</title>
</head>
<body>
<h3>Admin Console's main page</h3>
<p>
    <a href="<c:url value='/index.jsp' />">Home</a>
  | <a href="<c:url value='/GetAllUsers' />">Get All Users</a>
  | <a href="<c:url value='/LogoutUser' />">Log Out</a>
</p>
</body>
</html>
