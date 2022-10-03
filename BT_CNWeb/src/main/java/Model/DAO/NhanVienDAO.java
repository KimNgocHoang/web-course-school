package Model.DAO;

import java.util.*;
import Model.BEAN.NhanVien;
import java.sql.*;

public class NhanVienDAO {
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
	
	public ArrayList<NhanVien> getAllNV() throws ClassNotFoundException, SQLException
	{
		ArrayList<NhanVien> result = new ArrayList<NhanVien>();
		
		Connection con = getConnection();
		String sql = "select * from nhanvien";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			NhanVien nv = new NhanVien();
			nv.setIdnv(rs.getString("idnv"));
			nv.setHoten(rs.getString("hoten"));
			nv.setIdpb(rs.getString("idpb"));
			nv.setDiachi(rs.getString("diachi"));
			result.add(nv);
		}
		return result;
	}
	
	public void AddNV(NhanVien nv) throws ClassNotFoundException, SQLException
	{
		String sql = "insert into nhanvien(idnv, hoten, idpb, diachi) VALUES (?, ?, ?, ?)";
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, nv.getIdnv());
			ps.setString(2, nv.getHoten());
			ps.setString(3, nv.getIdpb());
			ps.setString(4, nv.getDiachi());
			//return ps.executeUpdate() >0;
			ps.executeUpdate();	
	}
	
	public NhanVien getNVByIDNV(String idnv) throws ClassNotFoundException, SQLException
	{
		NhanVien nv =null;
		String sql = "select * from nhanvien where idnv=?";
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, idnv);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			String ten = rs.getString("hoten");
			String idpb = rs.getString("idpb");
			String dc = rs.getString("diachi");
			nv = new NhanVien(idnv, ten, idpb, dc);
		}
		return nv;

		
	}
	
	public ArrayList<NhanVien> getListNVByIDPB(String id) throws ClassNotFoundException, SQLException
	{
		ArrayList<NhanVien> result = new ArrayList<NhanVien>();
		
		Connection con = getConnection();
		String sql = "select * from nhanvien where idpb=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			NhanVien nv = new NhanVien();
			nv.setIdnv(rs.getString("idnv"));
			nv.setHoten(rs.getString("hoten"));
			nv.setIdpb(rs.getString("idpb"));
			nv.setDiachi(rs.getString("diachi"));
			result.add(nv);
		}
		return result;
	}
	
	public void DeleteNV(String idnv) throws ClassNotFoundException, SQLException
	{
		String sql = "delete from nhanvien where idnv=?";
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, idnv);
			ps.executeUpdate();
	}
	
	public int DeleteListNV(String idnv) throws ClassNotFoundException, SQLException
	{
		String sql = "delete from nhanvien where idnv in (" + idnv + ")";
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
			//ps.setString(1, idnv);
			return ps.executeUpdate();
	}
}
