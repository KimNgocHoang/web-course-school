package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.BEAN.*;
import Model.BO.*;

/**
 * Servlet implementation class VacxinServlet
 */
@WebServlet("/")
public class VacxinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BO svBO = new BO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VacxinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
			try {
				switch (action) {
				case "/listnv": {
					showSV(request,response);
					break;
				}
				case "/listvcUpdate": {
					showVCUpdate(request,response);
					break;
				}
				case "/new": {
					showNewForm(request,response);
					break;
				}
				case "/insert": {
					InsertNV(request,response);
					break;
				}
				case "/edit-form": {
					showEditForm(request,response);
					break;
				}
				case "/update": {
					UpdateSV(request,response);
					break;
				}
				default:
					RequestDispatcher dispatcher = request.getRequestDispatcher("/list_SV.jsp");
					dispatcher.forward(request, response);
					break;
					
				}
			}
		  catch (Exception e) {
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
	
	private void showSV(HttpServletRequest request, HttpServletResponse response) {
    	try {
    		ArrayList<Vacxin> list = svBO.getAllSV();
			request.setAttribute("list", list);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/vacxin-list.jsp");
			rd.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	private void showVCUpdate(HttpServletRequest request, HttpServletResponse response) {
    	try {
    		ArrayList<Vacxin> list = svBO.getAllSV();
			request.setAttribute("list", list);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/UpdateVC-list.jsp");
			rd.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	private void showNewForm(HttpServletRequest request, HttpServletResponse response) {
    	try {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/insert-form.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	private void InsertNV(HttpServletRequest request, HttpServletResponse response) {
		String mssv = request.getParameter("txtmaSV");
		String Hoten = request.getParameter("txtHoten");
		String somui = request.getParameter("txtsomui");
		String mota = request.getParameter("txtmota");
		String gia = request.getParameter("txtgia");
		String hangsx = request.getParameter("txttenhang");
		Vacxin item = new Vacxin(mssv,Hoten,somui,mota,gia,hangsx);
		try {
		  svBO.AddSV(item);
		  response.sendRedirect("listnv");
		} catch (Exception e) {
		  e.printStackTrace();
		}
	}
	private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
    	try {
    		HttpSession session = request.getSession();
			String id = request.getParameter("mvc");
			Vacxin item = svBO.getVCByMVC(id);
			session.setAttribute("tenvacxin", item.getTenvacxin());
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/edit-form.jsp");
			request.setAttribute("item", item);
			dispatcher.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	private void UpdateSV(HttpServletRequest request, HttpServletResponse response) {
		String mssv = request.getParameter("txtmaSV");
		String Hoten = request.getParameter("txtHoten");
		String gioitinh = request.getParameter("gender");
		String khoa = request.getParameter("lstKhoa");
		
		Vacxin item = new Vacxin(mssv,Hoten,gioitinh,khoa);
		try {
			svBO.UpdateSV(item);
			response.sendRedirect("listnv");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
