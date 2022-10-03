package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.BO.NhanVienBO;

/**
 * Servlet implementation class DelAllNVServlet
 */
@WebServlet("/DelAllNVServlet")
public class DelAllNVServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelAllNVServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			NhanVienBO nvBO = new NhanVienBO();
			StringBuilder listDel = new StringBuilder();
			for(String id : request.getParameterValues("lst"))
			{
				listDel.append("'").append(id).append("',");
			}
			
			listDel.deleteCharAt(listDel.length() - 1);
			
			String txt = request.getParameter("txtNhap");
			int result = nvBO.DeleteListNV(txt);
			response.sendRedirect("ListDelAllNVServlet");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
