package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.BEAN.User;

public class UserDAO {
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
	public boolean isExistUser(String userName, String password) throws ClassNotFoundException, SQLException
	{
		Connection con = getConnection();
		PreparedStatement ps;
		String sql = "select * from admin where username=? and password=?";
		ps = con.prepareStatement(sql);
	 	ps.setString(1, userName);
	 	ps.setString(2, password);
	 	ResultSet rs = ps.executeQuery();
	 	return rs.next();
	}

	public void AddUser(User u) throws ClassNotFoundException, SQLException
	{
		String sql = "insert into admin(roles, username, password) VALUES (?, ?, ?)";
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, u.getRole());
			ps.setString(2, u.getUsername());
			ps.setString(3, u.getPassword());
			ps.executeUpdate();	
	}
}
