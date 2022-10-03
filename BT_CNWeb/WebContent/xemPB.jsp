<%@ page language="java" contentType="text/html; charset=UTF-8 "
    pageEncoding="UTF-8"%>
<%@ page language="java" import="Model.BEAN.PhongBan" %>
<%@ page language="java" import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content= "text/html;charset=UTF-8">
<title>Danh sach phong ban</title>
</head>
<body>
<table border="1" width="100%">
<h3 style="text-align: center;">Du lieu bang phong ban</h3>
	<tr>
		<th>IDPB</th>
		<th>Ten PB</th>
		<th>Mo ta</th>
		<th>Xem nhan vien</th>
	</tr>
	<% 
		ArrayList<PhongBan> pbArray=(ArrayList)request.getAttribute("pbArray");
		for(PhongBan pb: pbArray)
		{
	%>
	<tr> 
		<td> <%=pb.getIdpb() %></td> 
		<td> <%=pb.getTenpb() %></td> 
		<td> <%=pb.getMota() %></td> 
		<td><a href ='ListNVByPBServlet?sid=<%=pb.getIdpb() %>'>xxx </a> </td> 
	</tr>
	<% } %>
	</table>
	
</body>
</html>