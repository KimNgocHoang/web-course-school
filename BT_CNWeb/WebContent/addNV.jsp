<%@ page language="java" contentType="text/html; charset=UTF-8 "
    pageEncoding="UTF-8"%>
<%@ page language="java" import="Model.BEAN.PhongBan" %>
<%@ page language="java" import="Model.BO.PhongBanBO" %>
<%@ page language="java" import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
            <form name=f action= "AddNV" method="post">
                <table  border="0">
                    <caption>Chen thong tin nhan vien</caption>
                    <tr>
                        <th style="text-align: left;">Ma nhan vien &emsp;</th>
                        <th><input type= text name=txtmaNV></th>
                    </tr>
                    <tr>
                        <th style="text-align: left;">Ho ten &emsp;</th>
                        <th><input type= text name=txtHoten ></th>
                    </tr>
                    <tr>
                        <th style="text-align: left;">Ma phong ban &emsp;</th>
                        <th>
                            <select name=lstmaPB >
                                <option value="">Chon phong ban</option>
                                <% 
                                	PhongBanBO pbBO = new PhongBanBO();
                                	ArrayList<PhongBan> pbar= new ArrayList<PhongBan>();
                                	pbar = pbBO.getAllPB();
                                	for (PhongBan pb: pbar)
                                	{
                                
                                %>
                                 <!-- <?php while ($row = mysqli_fetch_array($result)):;?> 
                                <option value=""><?php echo $row[0];?></option>
                                <?php endwhile;?> -->
                                <!-- <?php echo $op;?> -->
                                <option value=""><%=pb.getIdpb() %></option>
                                <% } %>
                            </select>

                        </th>
                    </tr>
                    <tr>
                        <th style="text-align: left;">Dia chi &emsp;</th>
                        <th><input type= text name=txtDc ></th>
                    </tr>
                    <tr>
                        <th colspan="2">
                            <input type=submit name=add value="OK" >
                            <input type=reset name=r1 value="Reset">
                        </th>
                    </tr>
                </table>
            </form>
        </div>

</body>
</html>