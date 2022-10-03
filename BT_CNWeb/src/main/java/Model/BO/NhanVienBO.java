package Model.BO;

import java.sql.SQLException;
import java.util.ArrayList;

import Model.BEAN.NhanVien;
import Model.DAO.NhanVienDAO;
	
public class NhanVienBO {
	NhanVienDAO nvDAO = new NhanVienDAO();
	public ArrayList<NhanVien> getAllNV() throws ClassNotFoundException, SQLException 
	{
		return nvDAO.getAllNV();
	}

	public ArrayList<NhanVien> getListNVByIDPB(String id) throws ClassNotFoundException, SQLException 
	{
		return nvDAO.getListNVByIDPB(id);
	}
	public void DeleteNV(String idnv) throws ClassNotFoundException, SQLException
	{
		nvDAO.DeleteNV(idnv);
	}
	public void AddNV(NhanVien nv) throws ClassNotFoundException, SQLException
	{
		nvDAO.AddNV(nv);
	}
	public int DeleteListNV(String idnv) throws ClassNotFoundException, SQLException
	{
		return nvDAO.DeleteListNV(idnv);
	}
}
