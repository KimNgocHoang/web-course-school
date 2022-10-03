<%@ page language="java" contentType="text/html; charset=UTF-8 " pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content= "text/html;charset=UTF-8">
<title>Login Screen</title>
</head>
<body>

	<div align="center">
	<h3>Login</h3>
	<form name ="formLogin" action="CheckLoginServlet" method ="post">
		<table border="0">
                    <tr>
                        <th>Usename &emsp;</th>
						<th><input type="text" name="userName" ></th>
					</tr>
					 <tr>
                        <th>Password &emsp;</th>
                        <th><input type="password" name="password" ></th>
                    </tr>
                    <tr>
                        <th colspan="2">
                            <input type="submit" value="Login">
                            <input type=reset name=r1 value="Reset">
                        </th>
                    </tr>
         </table>
	</form>
	</div>
</body>
</html>