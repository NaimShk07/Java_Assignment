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
import model.Passenger;

/**
 * Servlet implementation class PassController
 */
@WebServlet("/PassController")
public class PassController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PassController() {
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
			Passenger p=new Passenger();
			p.setName(request.getParameter("name"));
			p.setNumber(Long.parseLong(request.getParameter("number")));
			p.setAge(Integer.parseInt(request.getParameter("age")));
			p.setAddress(request.getParameter("address"));
			p.setEmail(request.getParameter("email"));
			p.setPassword(request.getParameter("password"));
			PassDao.registerPassenger(p);
			response.sendRedirect("passenger-login.jsp");
			
		}else if(action.equalsIgnoreCase("login")) {
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			if(PassDao.checkEmail(email)) {
				Passenger p=PassDao.loginPassenger(email,password);
				if(p!=null) {
					HttpSession session=request.getSession();
					session.setAttribute("passenger",p);
					request.getRequestDispatcher("passenger-home.jsp").forward(request, response);
				}else {
					request.setAttribute("msg2", "password is incorrect");
					request.getRequestDispatcher("passenger-login.jsp").forward(request, response);
				}					
				
			}else {
				request.setAttribute("msg1", "Email is not register");
				request.getRequestDispatcher("passenger-login.jsp").forward(request, response);
			}
			
		}else if(action.equalsIgnoreCase("update")) {
			Passenger p=new Passenger();
			p.setPid(Integer.parseInt(request.getParameter("pid")));
			p.setName(request.getParameter("name"));
			p.setNumber(Long.parseLong(request.getParameter("number")));
			p.setAge(Integer.parseInt(request.getParameter("age")));
			p.setAddress(request.getParameter("address"));
			p.setEmail(request.getParameter("email"));
			p.setPassword(request.getParameter("password"));
			PassDao.updatePassenger(p);
			HttpSession session=request.getSession();
			session.setAttribute("passenger",p);
			request.getRequestDispatcher("passenger-home.jsp").forward(request, response);
		}
	}

}
