package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DriverDao;
import dao.PassDao;
import model.Driver;
import model.Passenger;

/**
 * Servlet implementation class DriverController
 */
@WebServlet("/DriverController")
public class DriverController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DriverController() {
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
		if(action.equalsIgnoreCase("register")) {
			Driver d=new Driver();
			d.setName(request.getParameter("name"));
			d.setNumber(Long.parseLong(request.getParameter("number")));
			d.setAge(Integer.parseInt(request.getParameter("age")));
			d.setAddress(request.getParameter("address"));
			d.setVname(request.getParameter("vname"));
			d.setEmail(request.getParameter("email"));
			d.setPassword(request.getParameter("password"));
			DriverDao.registerDriver(d);
			response.sendRedirect("driver-login.jsp");
			
		}else if(action.equalsIgnoreCase("login")) {
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			if(DriverDao.checkEmail(email)) {
				Driver d=DriverDao.loginDriver(email,password);
				if(d!=null) {
					HttpSession session=request.getSession();
					session.setAttribute("driver",d);
					request.getRequestDispatcher("driver-home.jsp").forward(request, response);
				}else {
					request.setAttribute("msg2", "password is incorrect");
					request.getRequestDispatcher("driver-login.jsp").forward(request, response);
				}				
			}else {
				request.setAttribute("msg1", "Email is not register");
				request.getRequestDispatcher("driver-login.jsp").forward(request, response);
			}
			
		}else if(action.equalsIgnoreCase("update")) {
			Driver d=new Driver();
			d.setDid(Integer.parseInt(request.getParameter("did")));
			d.setName(request.getParameter("name"));
			d.setNumber(Long.parseLong(request.getParameter("number")));
			d.setAge(Integer.parseInt(request.getParameter("age")));
			d.setAddress(request.getParameter("address"));
			d.setVname(request.getParameter("vname"));
			d.setEmail(request.getParameter("email"));
			d.setPassword(request.getParameter("password"));
			DriverDao.updateDriver(d);
			HttpSession session=request.getSession();
			session.setAttribute("driver",d);
			request.getRequestDispatcher("driver-home.jsp").forward(request, response);
			
		}
	}

}
