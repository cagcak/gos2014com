<%-- Created by Çağrı --%>
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page 
        contentType="text/html;charset=UTF-8" 
        language="java"
        pageEncoding="ISO-8859-1" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%--  This is the home page   --%>
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
      <meta content="text/html"/>
    <title>IAAUMAS | Home page</title>
  </head>
  <body>
  <h3>Welcome to the Home page</h3>
  <shiro:guest>
      <p>
          <a href="login.jsp">Go to Login page</a>
      </p>
  </shiro:guest>

  <shiro:authenticated>
      <p>
          <a href="secure/index.jsp">Secure Area</a>
          <shiro:hasRole name="admin">
              | <a href="admin/index.jsp">Admin Area</a>
          </shiro:hasRole>
      </p>

      <p>
          <a href="LogoutUser">Logout</a>
      </p>
  </shiro:authenticated>
  </body>
</html>