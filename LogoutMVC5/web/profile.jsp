<%-- 
    Document   : profile
    Created on : May 6, 2015, 4:08:45 PM
    Author     : zeek
--%>

<%
    response.setHeader("Cache-Control", "no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", -1);
    
    if(request.getAttribute("username")==null){
        response.sendRedirect("index.html");
    } 
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="homePage.jsp">HOME</a> | <a href="profile.jsp">PROFILE</a> | <a href="logoutServlet">LOGOUT</a>
        <h1>Hello <%=session.getAttribute("username")%>! Login Complete!</h1>
    </body>
</html>
