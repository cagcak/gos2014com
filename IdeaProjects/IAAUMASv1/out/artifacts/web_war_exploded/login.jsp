<%--
  Created by Çağrı in 11.12.2013 at 11:02
--%>
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page
        contentType="text/html;charset=UTF-8"
        language="java"
        pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta content="text/html; charset=ISO-8859-1" http-equiv="Content-Type">
    <title>IAAUMAS | Login Page</title>
</head>
<body>
<h3>Welcome to Login page</h3>
<p>You must login to visit pages in secure area</p>
<p style="color: orangered">${error}</p> <%-- this line shows the error message --%>
<form action="LoginUser" method="post">
    <table align="left" border="0" cellspacing="0" cellpadding="3">
        <tr>
            <td>Username</td>
            <td>
                <input type="text" name="username" maxlength="50">
            </td>
        </tr>

        <tr>
            <td>Password</td>
            <td>
                <input type="password" name="password" maxlength="50">
            </td>
        </tr>

        <tr>
            <td colspan="2" align="right">
                <input type="submit" name="submit" value="Login">
            </td>
        </tr>
    </table>
</form>
<br clear="left">
<p>
    <a name="index.jsp">Home</a>
</p>
</body>
</html>
