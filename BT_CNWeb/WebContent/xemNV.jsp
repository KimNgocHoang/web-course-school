<%@ page language="java" contentType="text/html; charset=UTF-8 "
    pageEncoding="UTF-8"%>
<%@ page language="java" import="Model.BEAN.NhanVien" %>
<%@ page language="java" import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content= "text/html;charset=UTF-8">
<title>Danh sach nhan vien</title>
</head>
<body>
<table border="1" width="100%">
<caption>Du lieu bang nhan vien</caption>
	<tr>
		<th>IDNV</th>
		<th>Ho ten</th>
		<th>IDPB</th>
		<th>Dia chi</th>
	</tr>
	<% 
		ArrayList<NhanVien> nvArray=(ArrayList)request.getAttribute("nvArray");
		for(NhanVien nv: nvArray)
		{
	%>
	<tr> 
		<td> <%=nv.getIdnv() %></td> 
		<td> <%=nv.getHoten() %></td> 
		<td> <%=nv.getIdpb() %></td> 
		<td> <%=nv.getDiachi() %></td> 
	</tr>
	
	<% } %>
	</table>

</body>
</html>