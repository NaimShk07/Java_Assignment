package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import user.User;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("submit")) {
			User u=new User();
			u.setName(request.getParameter("name"));
			u.setNumber(Long.parseLong(request.getParameter("number")));
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			UserDao.createUser(u);
			response.sendRedirect("read.jsp");
			
		}else if (action.equalsIgnoreCase("delete")) {
			int id=Integer.parseInt(request.getParameter("id"));
			UserDao.deleteUser(id);
			response.sendRedirect("read.jsp");
			
		}else if(action.equalsIgnoreCase("edit")) {
			int id=Integer.parseInt(request.getParameter("id"));
			User u=UserDao.getUserById(id);
			request.setAttribute("user", u);
			request.getRequestDispatcher("read.jsp").forward(request, response);

		}else if(action.equalsIgnoreCase("update")) {
			User u=new User();
			u.setId(Integer.parseInt(request.getParameter("id")));
			u.setName(request.getParameter("name"));
			u.setNumber(Long.parseLong(request.getParameter("number")));
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			UserDao.updateUser(u);
			response.sendRedirect("read.jsp");			
		}
	}

}
