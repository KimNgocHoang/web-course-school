package Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.BEAN.NhanVien;
import Model.DAO.NhanVienDAO;

/**
 * Servlet implementation class AddNVServlet
 */
@WebServlet("/AddNV")
public class AddNVServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNVServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			NhanVienDAO nvDAO = new NhanVienDAO();
			int idnv =Integer.parseInt(request.getParameter("txtmaNV"));
			String Hoten = request.getParameter("txtHoten");
			String idpb = request.getParameter("lstmaPB");
			String Diachi = request.getParameter("txtDc");
			
			NhanVien nv = new NhanVien(idnv, Hoten, idpb, Diachi);
			nvDAO.AddNV(nv);
			response.sendRedirect("ListNVServlet");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
//		try {
//			NhanVienDAO nvDAO = new NhanVienDAO();
//			int idnv =Integer.parseInt(request.getParameter("txtmaNV"));
//			String Hoten = request.getParameter("txtHoten");
//			String idpb = request.getParameter("lstmaPB");
//			String Diachi = request.getParameter("txtDc");
//			
//			//NhanVien nv = new NhanVien(idnv, Hoten, idpb, Diachi);
//			NhanVien nv = new NhanVien();
//			nv.setIDNV(idnv);
//			nv.setHoten(Hoten);
//			nv.setIDPB(idpb);
//			nv.setDiachi(Diachi);
//			nvDAO.AddNV(nv);
//			//response.sendRedirect("list");
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
