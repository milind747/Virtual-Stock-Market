<%-- 
    Document   : reset
    Created on : Mar 8, 2017, 12:58:51 PM
    Author     : Owner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="MailServ">
            Enter your id: <input type="text" name="mail"/>
            <input type="submit" value="Send"/> 

            <%
                if (request.getAttribute("msg1") != null) 
                {
                    String msg = request.getAttribute("msg1").toString();

            %>

            <%=msg%>

            <%
                }

            %>


        </form>
    </body>
</html>
