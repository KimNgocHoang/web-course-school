<%@ page language="java" contentType="text/html; charset=UTF-8 "
    pageEncoding="UTF-8"%>
<%@ page language="java" import="Model.BEAN.*" %>
<%@ page language="java" import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <h3>Sua Vacxin: <%= session.getAttribute("tenvacxin")%></h3> --%>
<form action=search method="post">
<table border="0" width="100%">
<h3 style="text-align: left;">Man hinh danh sach VC</h3>
<table border="1" width="100%">
	<tr>
		<th>Ma Vacxin</th>
		<th>Ten Vacxin</th>
		<th>So mui</th>
		<th>Mo ta</th>
		<th>Gia Vacxin</th>
		<th>Ten hang SX</th>
	</tr>
	<% 
		ArrayList<Vacxin> svArray=(ArrayList)request.getAttribute("list");
		for(Vacxin sv: svArray)
		{
	%>

	<tr> 
		<td> <%=sv.getMavacxin() %></td> 
		<td> <%=sv.getTenvacxin() %></td> 
		<td> <%=sv.getSomui() %></td> 
		<td> <%=sv.getMota() %></td>  
		<td> <%=sv.getGiavacxin() %></td> 
		<td> <%=sv.getTenhangsx() %></td> 
		<td style="text-align: center;"><a href ='<%=request.getContextPath()%>/edit-form?mvc=<%=sv.getMavacxin()%>'><button type="button" >Update </button></a>
		
		
	</tr>
	<% } %>
	</table>
	</form>
	<a href="history.back()"><button type="button" >Quay lai</button></a>
</body>
</html>