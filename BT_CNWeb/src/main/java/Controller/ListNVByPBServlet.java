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

import Model.BEAN.NhanVien;
import Model.BO.NhanVienBO;
import Model.BO.PhongBanBO;

/**
 * Servlet implementation class ListNVByPBServlet
 */
@WebServlet("/ListNVByPBServlet")
public class ListNVByPBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListNVByPBServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PhongBanBO pbBO = new PhongBanBO();
		String ipdb = request.getParameter("sid");
		String destination = null;
		
		NhanVienBO nvBO = new NhanVienBO();
		ArrayList<NhanVien> nvArray = null;
		
		try {
				nvArray = nvBO.getListNVByIDPB(ipdb);
				request.setAttribute("nvArray", nvArray);
				destination ="/listNVByPB.jsp";
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
		catch (ClassNotFoundException | SQLException | ServletException | IOException e) {
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
	}

}
