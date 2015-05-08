<%-- 
    Document   : addEditUsers
    Created on : 05 8, 15, 2:54:55 PM
    Author     : zeek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add/Edit Page</title>
    </head>
    <body>
        <center>
            <div><a href="#">HOME</a> | <a href="#">PROFILE</a> | <a href="#">LOGOUT</a></div>
        </center>
        <h1 style="margin-left: 8%;">Hello <%=session.getAttribute("username")%>!</h1> 
        <center>
            <form method="post" action="UserController">
                <input type="hidden" name="action" value="<%=request.getParameter("action")%>"/>
                <input type="hidden" name="userid" value="<%=request.getParameter("userid")%>"/>
                <label>Username: </label> <input type="text" name="username" placeholder="<%=request.getParameter("username")%>"/><br><br>
                <label>Password: </label> <input type="password" name="password"/><br><br>

                <a href="home.jsp">Cancel</a> <input type="submit" value="SUBMIT" name="btn"/>
            </form>
        </center>
    </body>
</html>
