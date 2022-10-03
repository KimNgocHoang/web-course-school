<%@ page language="java" contentType="text/html; charset=UTF-8 "
    pageEncoding="UTF-8"%>
<%@ page language="java" import="Model.BEAN.NhanVien" %>
<%@ page language="java" import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content= "text/html;charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="100%">
<h3 style="text-align: center;">Du lieu bang nhan vien</h3>
	<tr>
		<th>IDNV</th>
		<th>Ho ten</th>
		<th>Dia chi</th>
		<th>Xoa</th>
	</tr>
	<% 
		ArrayList<NhanVien> nvArray=(ArrayList)request.getAttribute("nvArray");
		for(NhanVien nv: nvArray)
		{
	%>
	<tr> 
		<td> <%=nv.getIdnv() %></td> 
		<td> <%=nv.getHoten() %></td> 
		<td> <%=nv.getDiachi() %></td>
		<td><a href ='Del1NVServlet?sid=<%=nv.getIdnv() %>'>xxx </a> </td> 
	</tr>
	<% } %>
	</table>
</body>
</html>