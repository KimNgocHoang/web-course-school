package Model.BO;

import java.sql.SQLException;
import java.util.ArrayList;

import Model.BEAN.PhongBan;
import Model.DAO.PhongBanDAO;


public class PhongBanBO {
	PhongBanDAO pbDAO = new PhongBanDAO();
	public ArrayList<PhongBan> getAllPB() throws ClassNotFoundException, SQLException 
	{
		return pbDAO.getAllPB();
	}
	public PhongBan getPBByIDPB(String idpb) throws ClassNotFoundException, SQLException
	{
		return pbDAO.getPBByIDPB(idpb);
	}
	public void UpdatePB(PhongBan pb) throws ClassNotFoundException, SQLException
	{
		pbDAO.UpdatePB(pb);
	}

}
