package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.BEAN.PhongBan;

public class PhongBanDAO {
	public Connection getConnection() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/DULIEU";
		String user ="root";
		String pass ="";
		Connection con = DriverManager.getConnection(url, user, pass);
		//System.out.println("Success!");
		return con;
	}
	
	public ArrayList<PhongBan> getAllPB() throws ClassNotFoundException, SQLException
	{
		ArrayList<PhongBan> result = new ArrayList<PhongBan>();
		
		//Connection con = getConnection();
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/DULIEU";
		String user ="root";
		String pass ="";
		Connection con = DriverManager.getConnection(url, user, pass);
		String sql = "select * from phongban";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			PhongBan pb = new PhongBan();
			pb.setIdpb(rs.getString("idpb"));
			pb.setTenpb(rs.getString("tenpb"));
			pb.setMota(rs.getString("mota"));
			result.add(pb);
		}
		return result;
	}
	
	public PhongBan getPBByIDPB(String idpb) throws ClassNotFoundException, SQLException
	{
		String sql = "select * from phongban where idpb=?";
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, idpb);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			return new PhongBan(rs.getString("idpb"), rs.getString("tenpb"), rs.getString("mota"));
		}
		return null;

		
	}
	
	public void UpdatePB(PhongBan pb) throws ClassNotFoundException, SQLException
	{
		String sql = "update phongban set tenpb=?, mota=? where idpb=?";
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, pb.getTenpb());
			ps.setString(2, pb.getMota());
			ps.setString(3, pb.getIdpb());
			ps.executeUpdate();
		
		
	}

	

}
