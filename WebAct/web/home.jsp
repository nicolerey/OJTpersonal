<%-- 
    Document   : home
    Created on : 05 8, 15, 2:25:05 PM
    Author     : zeek
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="com.model.UserBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <center>
            <div><a href="home.jsp">HOME</a> | <a href="profile.jsp">PROFILE</a> | <a href="logoutServlet">LOGOUT</a></div>
        </center>
        <h1 style="margin-left: 8%;">Hello <%=session.getAttribute("username")%>!</h1> 
        <center>
            <a href="addEditUsers.jsp?action=add&userid=0" style="margin-left: -11%;">Add User</a>
            <table style="margin-top: 0.5%;">
                <tr>
                    <th>Username</th><th>Password</th><th colspan="2">Action</th>
                </tr>
                <c:forEach items="${allUsers}" var="user">
                    <tr>
                        <td><c:out value="${user.username}"/></td>
                        <td><c:out value="${user.password}"/></td>
                        <td><a href="addEditUsers.jsp?action=edit&userid=<c:out value="${user.userID}"/>&username=<c:out value="${user.username}"/>">Edit</a></td>
                        <td><a href="UserController?action=delete&userid=<c:out value="${user.userID}"/>">Delete</a></td>
                    </tr>
                </c:forEach>
            </table>
        </center>
    </body>
</html>
