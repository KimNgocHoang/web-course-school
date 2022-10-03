package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.BEAN.*;

public class VacxinDAO {
	public Connection getConnection() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/TEST999";
		String user ="root";
		String pass ="";
		Connection con = DriverManager.getConnection(url, user, pass);
		//System.out.println("Success!");
		return con;
	}
	
	public ArrayList<Vacxin> getAllVC() throws ClassNotFoundException, SQLException
	{
		ArrayList<Vacxin> result = new ArrayList<Vacxin>();
		
		Connection con = getConnection();
		String sql = "SELECT * from vacxin";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			Vacxin nv = new Vacxin();
			nv.setMavacxin(rs.getString("mavacxin"));
			nv.setTenvacxin(rs.getString("tenvacxin"));
			nv.setSomui(rs.getString("somui"));
			nv.setMota(rs.getString("mota"));
			nv.setGiavacxin(rs.getString("giavacxin"));
			nv.setTenhangsx(rs.getString("tenhangsx"));
			result.add(nv);
		}
		return result;
	}
	
	public void AddVC(Vacxin nv) throws ClassNotFoundException, SQLException
	{
		String sql = "insert into vacxin(mavacxin, tenvacxin, somui, mota, giavacxin, tenhangsx) VALUES (?, ?, ?, ?, ?, ?)";
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, nv.getMavacxin());
			ps.setString(2, nv.getTenvacxin());
			ps.setString(3, nv.getSomui());
			ps.setString(4, nv.getMota());
			ps.setString(5, nv.getGiavacxin());
			ps.setString(6, nv.getTenhangsx());
			//return ps.executeUpdate() >0;
			ps.executeUpdate();	
	}
	
	public Vacxin getVCByMVC(String ma) throws ClassNotFoundException, SQLException
	{
		Vacxin nv =null;
		String sql = "select * from vacxin where mavacxin=?";
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, ma);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			String tenvc = rs.getString("tenvacxin");
			String somui = rs.getString("somui");
			String ta = rs.getString("mota");
			String gia = rs.getString("giavacxin");
			String hangsx = rs.getString("tenhangsx");
			nv = new Vacxin(ma, tenvc, somui, ta, gia, hangsx);
		}
		return nv;

		
	}
	
	public ArrayList<Vacxin> getListSVByKhoa(int khoa) throws ClassNotFoundException, SQLException
	{
		ArrayList<Vacxin> result = new ArrayList<Vacxin>();
		
		Connection con = getConnection();
		String sql = "select * from sinhvien where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, khoa);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			Vacxin sv = new Vacxin();
			sv.setMssv(rs.getString("mssv"));
			sv.setHoten(rs.getString("hoten"));
			sv.setGioitinh(rs.getString("gioitinh"));
			sv.setId(rs.getInt("id"));
			result.add(sv);
		}
		return result;
	}
	
	public void UpdateSV(Vacxin sv) throws ClassNotFoundException, SQLException
	{
		String sql = "update vacxin set tenvacxin=?, somui=?, mota=?, giavacxin=?, tenhangsx=? where mssv=?";
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, sv.getTenvacxin());
		ps.setString(2, sv.getSomui());
		ps.setString(3, sv.getMota());
		ps.setString(4, sv.getGiavacxin());
		ps.setString(5, sv.getTenhangsx());
		ps.setString(4, sv.getMavacxin());
			ps.executeUpdate();	
	}

}
