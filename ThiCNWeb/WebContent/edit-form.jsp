<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page language="java" import="java.util.ArrayList" %>
    <%@page language="java" import="Model.BEAN.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Sua sinh vien: <%= session.getAttribute("tenvacxin")%></h3>
<%
Vacxin item = (Vacxin)request.getAttribute("item");
%> 
	
<div align="center">
            <form name=f action= "update" method="post">
                <table  border="0">
                    <caption>Chen thong tin Vacxin</caption>
                    <tr>
                        <th style="text-align: left;">Ma Vacxin &emsp;</th>
                        <th><input type= text name=txtmaSV readonly value='${item.mavacxin}'></th>
                    </tr>
                    <tr>
                        <th style="text-align: left;">Ten Vacxin &emsp;</th>
                        <th><input type= text name=txtHoten value='${item.tenvacxin}'></th>
                    </tr>
                    <tr>
                        <th style="text-align: left;">So mui&emsp;</th>
                        <th><input type= text name=txtsomui value='${item.somui}'></th>
                    </tr>
                    </tr>
                    <tr>
                        <th style="text-align: left;">Mo ta&emsp;</th>
                        <th><input type= text name=txtmota value='${item.mota}'></th>
                    </tr>
                    <tr>
                        <th style="text-align: left;">Gia Vacxin&emsp;</th>
                        <th><input type= text name=txtgia value='${item.giavacxin}'></th>
                    </tr>
                    <tr>
                        <th style="text-align: left;">Ten hang SX&emsp;</th>
                        <th><input type= text name=txttenhang value='${item.tenhangsx}'></th>
                    </tr>
                    <tr>
                        <th colspan="2">
                            <input type=submit name=add value="Luu lai" >
                            <a href=""><button type="button" >Quay lai</button></a>
                        </th>
                    </tr>
                </table>
            </form>
        </div>

</body>
</html>