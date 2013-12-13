<%--
  Created by Çağrı in 11.12.2013 at 11:19
--%>
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page
        contentType="text/html;charset=UTF-8"
        language="java"
        pageEncoding="ISO-8859-1" %>

<%@taglib
        prefix="c"
        uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta content="text/html; charset=ISO-8859-1" http-equiv="Content-Type">
    <title>IAAUMAS | UnAuthorized!</title>
</head>
<body>
<h3>Welcome to The Role Security Unauthorized Page</h3>
<p>You must login to visit pages in our secure and admin areas</p>
<p>You must have the correct role to view pages in our admin area.</p>
<p style="color:red">You have attempted to visit an area of
    our web site that you are not authorized to view.</p>

<br clear="left" />
<p>
    <a href='index.jsp'>Home</a>
    | <a href="<c:url value="/login.jsp" />">Login</a>
</p>

</body>
</html>
