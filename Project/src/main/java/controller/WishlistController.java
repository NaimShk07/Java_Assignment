package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import dao.WishlistDao;
import model.Product;
import model.Wishlist;

/**
 * Servlet implementation class WishlistController
 */
@WebServlet("/WishlistController")
public class WishlistController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WishlistController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("addtowishlist")) {
			int pid=Integer.parseInt(request.getParameter("pid"));
			int cusid=Integer.parseInt(request.getParameter("cusid"));
			Product p=ProductDao.getProductByPid(pid);
			Wishlist w=new Wishlist();
			w.setPid(pid);
			w.setCusid(cusid);
			w.setSid(p.getSid());			
			w.setPprice(p.getPprice());
			w.setImage(p.getImage());
			w.setPname(p.getPname());
			w.setPcategory(p.getPcategory());
			w.setPdesc(p.getPdesc());
			WishlistDao.insertWishlist(w);
			response.sendRedirect("customer-home.jsp");
			
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
