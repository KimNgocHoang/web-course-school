package Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.BEAN.PhongBan;
import Model.BO.PhongBanBO;
import Model.DAO.PhongBanDAO;

/**
 * Servlet implementation class UpdatePBServlet
 */
@WebServlet("/UpdatePBServlet")
public class UpdatePBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePBServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PhongBanBO pbBO = new PhongBanBO();
		String ipdb = request.getParameter("sid");
		try {
			PhongBan pb = pbBO.getPBByIDPB(ipdb);
			request.setAttribute("p", pb);
			request.getRequestDispatcher("Form_Update.jsp").forward(request, response);
			
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		try {
			PhongBanBO pbBO = new PhongBanBO();
			String id = request.getParameter("ip");
			String ten = request.getParameter("txttenpb");
			String mt = request.getParameter("txtmota");
			PhongBan pb = new PhongBan(id, ten, mt);
			response.sendRedirect("UpdateListServlet");
			pbBO.UpdatePB(pb);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
