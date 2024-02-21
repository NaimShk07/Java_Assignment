package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBconnection;
import model.BookedRides;

public class BookedRideDao {
	public static void insertBookedride(BookedRides br) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="insert into bookedride(rid,did,pid,fhprice,shprice,ridedate,departure,dtime,arrival,atime,pickup) values(?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, br.getRid());
			pst.setInt(2, br.getDid());
			pst.setInt(3, br.getPid());			
			pst.setInt(4, br.getFhprice());
			pst.setInt(5, br.getShprice());
			pst.setString(6, br.getRideDate());
			pst.setString(7, br.getDeparture());
			pst.setString(8, br.getDtime());
			pst.setString(9,br.getArrival());
			pst.setString(10, br.getAtime());
			pst.setString(11, br.getPickup());
			pst.executeUpdate();
			System.out.println("Booked ride inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<BookedRides> getBookedrideByPid(int pid){
		List<BookedRides> list=new ArrayList<>();
		try {
			Connection conn=DBconnection.createConnection();
			String sql="select * from bookedride where pid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, pid);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				BookedRides br=new BookedRides();
				br.setBrid(rs.getInt("brid"));
				br.setRid(rs.getInt("rid"));
				br.setDid(rs.getInt("did"));
				br.setPid(rs.getInt("pid"));
				
				br.setFhprice(rs.getInt("fhprice"));
				br.setShprice(rs.getInt("shprice"));
				br.setRideDate(rs.getString("ridedate"));
				br.setDeparture(rs.getString("departure"));
				br.setDtime(rs.getString("dtime"));
				br.setArrival(rs.getString("arrival"));
				br.setAtime(rs.getString("atime"));
				br.setPickup(rs.getString("pickup"));
				list.add(br);
			}
			System.out.println("Get all booked ride by pid");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static List<BookedRides> getAllBookedride(){
		List<BookedRides> list=new ArrayList<>();
		try {
			Connection conn=DBconnection.createConnection();
			String sql="select * from bookedride ";
			PreparedStatement pst=conn.prepareStatement(sql);			
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				BookedRides br=new BookedRides();
				br.setBrid(rs.getInt("brid"));
				br.setRid(rs.getInt("rid"));
				br.setDid(rs.getInt("did"));
				br.setPid(rs.getInt("pid"));				
				br.setFhprice(rs.getInt("fhprice"));
				br.setShprice(rs.getInt("shprice"));
				br.setRideDate(rs.getString("ridedate"));
				br.setDeparture(rs.getString("departure"));
				br.setDtime(rs.getString("dtime"));
				br.setArrival(rs.getString("arrival"));
				br.setAtime(rs.getString("atime"));
				br.setPickup(rs.getString("pickup"));
				list.add(br);
			}
			System.out.println("Get all booked ride ");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static void updateBrPrice(BookedRides br) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="update bookedride set fhprice=?, shprice=? where rid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, br.getFhprice());
			pst.setInt(2, br.getShprice());
			pst.setInt(3, br.getRid());
			pst.executeUpdate();
			System.out.println("booked ride price updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
