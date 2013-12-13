<%--
  Created by Çağrı in 11.12.2013 at 19:32
--%>
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java"  contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>IAAUMAS | Admin Console | Users</title>
</head>
<body>
<h3>Admin Area</h3>
<p>Here is information on our users from the data store:</p>

<c:forEach var="user" items="${userList}">
    <p>
        User ID: ${user.userID} <br />
        Username: ${user.username} <br />
        Password: ${user.password}
    </p>

</c:forEach>
    <p>
        <a href="<c:url value='/index.jsp' />">Home </a>
      | <a href="<c:url value='/LogoutUser' />">Log Out</a>
    </p>

</body>
</html>
