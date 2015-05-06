<%-- 
    Document   : homePage
    Created on : May 6, 2015, 3:03:28 PM
    Author     : zeek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            String type = request.getParameter("type");
        %>
    </head>
    <body>
        <h1>Hello <%=type%>!</h1>
    </body>
</html>
