package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookedRideDao;
import dao.RidesDao;
import model.BookedRides;
import model.Rides;

/**
 * Servlet implementation class BookedRideController
 */
@WebServlet("/BookedRideController")
public class BookedRideController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookedRideController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("book")) {
			int rid=Integer.parseInt(request.getParameter("rid"));
			int pid=Integer.parseInt(request.getParameter("pid"));
			String pickup=request.getParameter("pickup");
			
			Rides r=RidesDao.getSingleRideByRid(rid);
			
			BookedRides br=new BookedRides();
			br.setRid(rid);
			br.setDid(r.getDid());
			br.setPid(pid);
//			br.setNoofseatfill(1);	
			if(pickup.equalsIgnoreCase("default")) {
				br.setFhprice((r.getPrice()/2)/(r.getNoofseatfill()+1));
				br.setShprice((r.getPrice()/2)/(r.getNoofseatfill()+1));
			}else {
				br.setFhprice(0);
				br.setShprice((r.getPrice()/2)/(r.getNoofseatfill()+1));
			}
			List<BookedRides> list=BookedRideDao.getAllBookedride();
			if(list!=null) {
				for(BookedRides brlist:list) {
					System.out.println(brlist);
					BookedRides br2=new BookedRides();
					if(brlist.getPickup().equalsIgnoreCase("default")) {
						if(pickup.equalsIgnoreCase("other")) {
							br2.setFhprice(brlist.getFhprice());
							br2.setShprice((r.getPrice()/2)/(r.getNoofseatfill()+1));
						}else if(pickup.equalsIgnoreCase("default")) {
							br2.setFhprice((r.getPrice()/2)/(r.getNoofseatfill()+1));
							br2.setShprice((r.getPrice()/2)/(r.getNoofseatfill()+1));
						}
						
					}else if(brlist.getPickup().equalsIgnoreCase("other")) {
						br.setFhprice(brlist.getFhprice());
						br.setShprice((r.getPrice()/2)/(r.getNoofseatfill()+1));
					}
					br2.setRid(brlist.getRid());
					BookedRideDao.updateBrPrice(br2);
				}
			}			
			br.setRideDate(r.getRideDate());
			br.setDeparture(r.getDeparture());
			br.setDtime(r.getDtime());
			br.setArrival(r.getArrival());
			br.setAtime(r.getAtime());	
			br.setPickup(pickup);
			BookedRideDao.insertBookedride(br);		
			System.out.println(br);
			int num=r.getNoofseatfill()+1;
			RidesDao.updateRideNoofSeat(num, rid);
			response.sendRedirect("passenger-home.jsp");
		}
	}

}
