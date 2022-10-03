<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page language="java" import="Model.BEAN.*" %>
<%@ page language="java" import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
            <form name=f action= "insert" method="post">
                <table  border="0">
                    <caption>Chen thong tin Vacxin</caption>
                    <tr>
                        <th style="text-align: left;">Ma Vacxin &emsp;</th>
                        <th><input type= text name=txtmaSV></th>
                    </tr>
                    <tr>
                        <th style="text-align: left;">Ten Vacxin &emsp;</th>
                        <th><input type= text name=txtHoten ></th>
                    </tr>
                    <tr>
                        <th style="text-align: left;">So mui&emsp;</th>
                        <th><input type= text name=txtsomui ></th>
                    </tr>
                    <tr>
                        <th style="text-align: left;">Mo ta&emsp;</th>
                        <th><input type= text name=txtmota ></th>
                    </tr>
                    <tr>
                        <th style="text-align: left;">Gia Vacxin&emsp;</th>
                        <th><input type= text name=txtgia ></th>
                    </tr>
                    <tr>
                        <th style="text-align: left;">Ten hang SX&emsp;</th>
                        <th><input type= text name=txttenhang ></th>
                    </tr>
                    <tr>
                        <th colspan="2">
                            <input type=submit name=add value="Them moi" >
                            <a href="history.back()"><button type="button" >Quay lai</button></a>
                        </th>
                    </tr>
                </table>
            </form>
        </div>
</body>
</html>