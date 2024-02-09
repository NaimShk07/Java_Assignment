package controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import dao.SellerDao;
import model.Customer;
import model.Seller;
import service.Servicess;

/**
 * Servlet implementation class SellerController
 */
@WebServlet("/SellerController")
public class SellerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SellerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("register")) {
			String email=request.getParameter("email");
			if(SellerDao.checkRegisterEmail(email)) {
				request.setAttribute("msg","Email already exists");
				request.getRequestDispatcher("seller-register.jsp").forward(request, response);					
			
			}
			else {
				Seller u=new Seller();
				u.setName(request.getParameter("name"));
				u.setContact(Long.parseLong(request.getParameter("contact")));
				u.setAddress(request.getParameter("address"));
				u.setEmail(request.getParameter("email"));
				u.setPassword(request.getParameter("password"));
				System.out.println(u);
				SellerDao.registerSeller(u);
				request.setAttribute("msg","data register successfully");
				request.getRequestDispatcher("seller-login.jsp").forward(request, response);					
			}
		}
		else if(action.equalsIgnoreCase("login")) {
			String email=request.getParameter("email");
			String pass=request.getParameter("password");
			boolean flag=SellerDao.checkEmail(email);
			if(flag) {
				Seller u=SellerDao.LoginUser(email, pass);			
				if(u!=null) {
					HttpSession session= request.getSession();
					session.setAttribute("user",u);
					request.getRequestDispatcher("seller-home.jsp").forward(request, response);			
				}
				else {
					request.setAttribute("msg2","password is incorrect");
					request.getRequestDispatcher("seller-login.jsp").forward(request,response);
				}								
			}
			else {
				request.setAttribute("msg1","email is not registered");
				request.getRequestDispatcher("seller-login.jsp").forward(request,response);
			}
			
		}
		else if(action.equalsIgnoreCase("update")) {
			Seller u=new Seller();
			u.setId(Integer.parseInt(request.getParameter("id")));
			u.setName(request.getParameter("name"));
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setAddress(request.getParameter("address"));
			u.setEmail(request.getParameter("email"));
			SellerDao.updateSellerProfile(u);
			System.out.println(u);
			HttpSession session= request.getSession();
			session.setAttribute("user",u);
			request.getRequestDispatcher("seller-home.jsp").forward(request, response);			
		
		}
		else if(action.equalsIgnoreCase("change password")) {
			int id=Integer.parseInt(request.getParameter("id"));
			String op=request.getParameter("op");
			String np=request.getParameter("np");
			String cnp=request.getParameter("cnp");
			boolean flag= SellerDao.checkOldPass(id,op);
			if(flag) {
				if(np.equals(cnp)) {
					SellerDao.updatePassword(id,np);
					response.sendRedirect("seller-home.jsp");
			}
				else {
					request.setAttribute("msg","new password and confirm password are not same");
					request.getRequestDispatcher("seller-change-password.jsp").forward(request,response);
				
				}
				
			}
			else {
				request.setAttribute("msg","old password is incorrect");
				request.getRequestDispatcher("seller-change-password.jsp").forward(request,response);
			
			}
			
			
		}
		else if(action.equalsIgnoreCase("send otp")) {
			String email=request.getParameter("email");
			boolean flag=SellerDao.checkEmail(email);			
			if(flag) {
				Servicess s =new Servicess();
				Random r=new Random();
				int num=r.nextInt(999999);
				System.out.println(num);
				s.sendMail(email, num);
				request.setAttribute("email",email);
				request.setAttribute("otp",num);
				request.getRequestDispatcher("seller-verify-otp.jsp").forward(request, response);
				
			}else {
				request.setAttribute("msg","Email not registered");
				request.getRequestDispatcher("seller-forgot-password.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("verify")) {
			String email=request.getParameter("email");
			int otp1=Integer.parseInt(request.getParameter("otp1"));
			int otp2=Integer.parseInt(request.getParameter("otp2"));
			System.out.println(email);
			System.out.println(otp1);
			System.out.println(otp2);
			if(otp1==otp2) {
				request.setAttribute("email", email);
				request.getRequestDispatcher("seller-new-pass.jsp").forward(request, response);
			}
			else {
				request.setAttribute("email", email);
				request.setAttribute("otp", otp1);
				request.setAttribute("msg","Otp not matched");
				request.getRequestDispatcher("seller-verify-otp.jsp").forward(request, response);
				}
		}
		else if(action.equalsIgnoreCase("new password")) {
			String email=request.getParameter("email");
			String np=request.getParameter("np");
			String cnp=request.getParameter("cnp");
			if(np.equals(cnp)) {
				SellerDao.newPassword(email,np);
				response.sendRedirect("seller-login.jsp");
				
			}
			
		}
	}

}
