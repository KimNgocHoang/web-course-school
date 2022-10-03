<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>

    </head>
    <body bgcolor="#AABBCC">
        <div align="center">
            <form action="SearchServlet" method="post">
                <table border="0">
                    <tr>
                        <input name="chon" type="radio" value="manv"/>Ma nhan vien
                        <input name="chon" type="radio" value="tennv"/>Ten nhan vien
                        <input name="chon" type="radio" value="idpb"/>Phong ban
                        <input name="chon" type="radio" value="dc"/>Dia chi
                    </tr>
                    <tr>
                        <th>Nhap tu khoa &emsp;</th>
                        <th><input type= text name=txtNhap ></th>
                    </tr>
                    <tr>
                        <th colspan="2">
                            <input type=submit name=b1 value="OK">
                            <input type=reset name=r1 value="Reset">
                        </th>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>