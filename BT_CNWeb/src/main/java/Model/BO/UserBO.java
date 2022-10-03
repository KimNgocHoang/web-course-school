package Model.BO;

import java.sql.SQLException;

import Model.DAO.UserDAO;

public class UserBO {
	UserDAO uDAO = new UserDAO();
	public boolean isValidUser(String userName, String password) throws ClassNotFoundException, SQLException
	{
		return uDAO.isExistUser(userName, password);
	}

}
