<%@ page language="java" contentType="text/html; charset=UTF-8 "
    pageEncoding="UTF-8"%>
<%@ page language="java" import="Model.BEAN.User" %>
<%@ page language="java" import="Model.BO.*" %>
<%@ page language="java" import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3>DANG KI TAI KHOAN</h3>
            <form name=f action= "RegisterServlet" method="post">
                <table  border="0">
                    <tr>
                        <th style="text-align: left;">UserName &emsp;</th>
                        <th><input type= text name=txtUN required></th>
                    </tr>
                    <tr>
                        <th style="text-align: left;">Password &emsp;</th>
                        <th><input type= "password" name=txtPW required></th>
                    </tr>
                    
                    <tr>
                        <th style="text-align: left;">Roles &emsp;</th>
                        <th><input type= text name=txtRoles value =2 readonly></th>
                    </tr>
                    <tr>
                        <th colspan="2">
                            <input type=submit  value="OK" >
                            <input type=reset name=r1 value="Reset">
                        </th>
                    </tr>
                </table>
            </form>
        </div>

</body>
</html>