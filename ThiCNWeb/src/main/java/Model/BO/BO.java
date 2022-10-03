package Model.BO;

import java.sql.SQLException;
import java.util.ArrayList;

import Model.BEAN.*;
import Model.DAO.*;

public class BO {
	UserDAO uDAO = new UserDAO();
	VacxinDAO vDAO =new VacxinDAO();
	
	public boolean isValidUser(String userName, String password) throws ClassNotFoundException, SQLException
	{
		return uDAO.isExistUser(userName, password);
	}
	public ArrayList<Vacxin> getAllSV() throws ClassNotFoundException, SQLException
	{
		return vDAO.getAllVC();
	}

	public void AddSV(Vacxin nv) throws ClassNotFoundException, SQLException
	{
		vDAO.AddVC(nv);
	}
	public void UpdateSV(Vacxin sv) throws ClassNotFoundException, SQLException
	{
		vDAO.UpdateSV(sv);
	}
	public void AddUser(User u) throws ClassNotFoundException, SQLException
	{
		uDAO.AddUser(u);
	}
	
	public Vacxin getVCByMVC(String ma) throws ClassNotFoundException, SQLException
	{
		return vDAO.getVCByMVC(ma);
	}
}
