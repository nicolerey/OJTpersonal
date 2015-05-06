<%-- 
    Document   : homePage
    Created on : May 6, 2015, 3:41:00 PM
    Author     : zeek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
          String username = request.getParameter("username");
        %>
    </head>
    <body>
        <h1>Hello <%=username%>! Login Complete!</h1>
    </body>
</html>
