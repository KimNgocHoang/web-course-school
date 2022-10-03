<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
        <style>
            body{
                font-family: sans-serif;
                font-size: 15px;
            }
            #menu ul{
                background-color: white;
                width: 250px;
                padding: 0;
                list-style-type: none;
            }
            #menu ul li {
                width: auto;
                height: 40px;
                line-height: 40px;
                border-bottom: 1px dotted #9e9d9d;
                padding: 0 1em;
            }
            #menu ul li a{
                text-decoration: none;
                color: rgb(12, 11, 11);
                font-weight: bold;
                display: block;
            }
            #menu ul li a:hover{
                background: rgb(49, 102, 182);
            }
        </style>
        <th><h4><strong>TIEM CHUNG</strong></h4></th>
        <div id="menu">
            <ul>
                <li><a href="<%=request.getContextPath()%>/listnv">Xem danh sach Vacxin</a></li>
                <li><a href="<%=request.getContextPath()%>/listvcUpdate" >Cap Nhat Vacxin</a></li> 
                <li><a href="<%=request.getContextPath()%>/new">Them Vacxin</a></li>
            	<li><a href="" >Danh sach tiem phong cua KH</a></li>
            	<li><a href="" >Thong ke tien KH da tra</a></li>
            </ul> 
        </div>    
    </body>
</html>