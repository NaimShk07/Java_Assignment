package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RidesDao;
import model.Rides;

/**
 * Servlet implementation class RideController
 */
@WebServlet("/RideController")
public class RideController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RideController() {
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
		if(action.equalsIgnoreCase("add ride")) {
			int did=Integer.parseInt(request.getParameter("did"));
			Rides r=new Rides();
			r.setDid(did);
			r.setRideDate(request.getParameter("date"));
			r.setDeparture(request.getParameter("departure"));
			r.setExactDeparture(request.getParameter("exactdeparture"));
			r.setDtime(request.getParameter("dtime"));
			r.setArrival(request.getParameter("arrival"));
			r.setExactArrival(request.getParameter("exactarrival"));
			r.setAtime(request.getParameter("atime"));
			r.setDistKm(Integer.parseInt(request.getParameter("distkm")));
			r.setNoOfSeat(Integer.parseInt(request.getParameter("seat")));
			r.setNoofseatfill(Integer.parseInt(request.getParameter("seatfill")));
			r.setPrice(Integer.parseInt(request.getParameter("price")));
			RidesDao.addRide(r);
			System.out.println(r);
			response.sendRedirect("driver-home.jsp");
		}else if(action.equalsIgnoreCase("update")) {
			Rides r=new Rides();
			r.setRid(Integer.parseInt(request.getParameter("rid")));
			r.setRideDate(request.getParameter("date"));
			r.setDeparture(request.getParameter("departure"));
			r.setExactDeparture(request.getParameter("exactdeparture"));
			r.setDtime(request.getParameter("dtime"));
			r.setArrival(request.getParameter("arrival"));
			r.setExactArrival(request.getParameter("exactarrival"));
			r.setAtime(request.getParameter("atime"));
			r.setDistKm(Integer.parseInt(request.getParameter("distkm")));
			r.setNoOfSeat(Integer.parseInt(request.getParameter("seat")));
			r.setNoofseatfill(Integer.parseInt(request.getParameter("seatfill")));
			r.setPrice(Integer.parseInt(request.getParameter("price")));
			RidesDao.updateRide(r);
			System.out.println(r);
			response.sendRedirect("manage-ride.jsp");
		}else if(action.equalsIgnoreCase("delete")) {
						
		}
	}

}
