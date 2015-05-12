<%-- 
    Document   : profile
    Created on : 05 8, 15, 4:01:44 PM
    Author     : zeek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    response.setHeader("Cache-Control", "no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", -1);
    
    Object username = session.getAttribute("username");
    if(username.equals(null))
        response.sendRedirect("index.html");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
    </head>
    <body>
        <center>
            <div><a href="home.jsp">HOME</a> | <a href="profile.jsp">PROFILE</a> | <a href="logoutServlet">LOGOUT</a></div>
        </center>
        <h1 style="margin-left: 8%;">Hello <%=session.getAttribute("username")%>!</h1> 
        <center>
            <table style="margin-top: 0.5%;">
                <tr>
                    <th>Username</th><th>Password</th><th colspan="2">Action</th>
                </tr>
                <tr>
                    <td><%=session.getAttribute("username")%></td>
                    <td><%=session.getAttribute("password")%></td>
                    <td><a href="addEditUsers.jsp?action=edit&userid=<%=session.getAttribute("userID")%>&username=<%=session.getAttribute("username")%>">Edit</a></td>
                    <td><a href="UserController?action=delete&userid=<%=session.getAttribute("userID")%>">Delete</a></td>
                </tr>
            </table>
        </center>
    </body>
</html>
