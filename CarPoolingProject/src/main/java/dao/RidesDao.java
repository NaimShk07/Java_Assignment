package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBconnection;
import model.Rides;

public class RidesDao {
	public static void addRide(Rides r) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="insert into ride(did,date,departure,exactdeparture,dtime,arrival,exactarrival,atime,distkm,noofseat,price,noofseatfill) values(?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);	
			pst.setInt(1, r.getDid());
			pst.setString(2, r.getRideDate());
			pst.setString(3, r.getDeparture());
			pst.setString(4, r.getExactDeparture());
			pst.setString(5, r.getDtime());
			pst.setString(6, r.getArrival());
			pst.setString(7, r.getExactArrival());
			pst.setString(8, r.getAtime());
			pst.setInt(9,r.getDistKm());
			pst.setInt(10, r.getNoOfSeat());
			pst.setInt(11, r.getPrice());
			pst.setInt(12,r.getNoofseatfill());
			
			pst.executeUpdate();
			System.out.println("ride added");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<Rides> getRidesByDid(int did){
		List<Rides> list=new ArrayList<Rides>();
		try {
			Connection conn=DBconnection.createConnection();
			String sql="select * from ride where did=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, did);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Rides r=new Rides();
				r.setRid(rs.getInt("rid"));
				r.setDid(rs.getInt("did"));
				r.setRideDate(rs.getString("date"));
				r.setDeparture(rs.getString("departure"));
				r.setExactDeparture(rs.getString("exactdeparture"));
				r.setDtime(rs.getString("dtime"));
				r.setArrival(rs.getString("arrival"));
				r.setExactArrival(rs.getString("exactarrival"));
				r.setAtime(rs.getString("atime"));
				r.setDistKm(rs.getInt("distkm"));
				r.setNoOfSeat(rs.getInt("noofseat"));
				r.setNoofseatfill(rs.getInt("noofseatfill"));
				r.setPrice(rs.getInt("price"));
				list.add(r);				
			}
			System.out.println("Get all ride by did");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static Rides getSingleRideByRid(int rid) {
		Rides r=null;
		try {
			Connection conn=DBconnection.createConnection();
			String sql="select * from ride where rid=?";
			PreparedStatement pst= conn.prepareStatement(sql);
			pst.setInt(1, rid);
			ResultSet rs= pst.executeQuery();
			while(rs.next()) {
				r=new Rides();
				r.setRid(rs.getInt("rid"));
				r.setDid(rs.getInt("did"));
				r.setRideDate(rs.getString("date"));
				r.setDeparture(rs.getString("departure"));
				r.setExactDeparture(rs.getString("exactdeparture"));
				r.setDtime(rs.getString("dtime"));
				r.setArrival(rs.getString("arrival"));
				r.setExactArrival(rs.getString("exactarrival"));
				r.setAtime(rs.getString("atime"));
				r.setDistKm(rs.getInt("distkm"));
				r.setNoOfSeat(rs.getInt("noofseat"));
				r.setNoofseatfill(rs.getInt("noofseatfill"));
				r.setPrice(rs.getInt("price"));
			}
			System.out.println("Get single ride by rid");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	}
	public static void updateRide(Rides r) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="update ride set date=?,departure=?,exactdeparture=?,dtime=?,arrival=?,exactarrival=?,atime=?,distkm=?,noofseat=?,noofseatfill=?,price=? where rid=?";
			PreparedStatement pst= conn.prepareStatement(sql);
			pst.setString(1, r.getRideDate());
			pst.setString(2, r.getDeparture());
			pst.setString(3, r.getExactDeparture());
			pst.setString(4, r.getDtime());
			pst.setString(5, r.getArrival());
			pst.setString(6, r.getExactArrival());
			pst.setString(7, r.getAtime());
			pst.setInt(8, r.getDistKm());
			pst.setInt(9, r.getNoOfSeat());
			pst.setInt(10, r.getNoofseatfill());
			pst.setInt(11, r.getPrice());
			pst.setInt(12, r.getRid());
			pst.executeUpdate();
			System.out.println("Ride updated");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void updateRideNoofSeat(int num,int rid) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="update ride set noofseatfill=? where rid=?";
			PreparedStatement pst= conn.prepareStatement(sql);			
			pst.setInt(1, num);			
			pst.setInt(2, rid);
			pst.executeUpdate();
			System.out.println("no of seat updated");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteRide(int rid) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="delete from ride where rid=?";
			PreparedStatement pst= conn.prepareStatement(sql);
			pst.setInt(1, rid);
			pst.executeUpdate();
			System.out.println("Ride deleted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<Rides> getAllRides(){
		List<Rides> list=new ArrayList<Rides>();
		try {
			Connection conn=DBconnection.createConnection();
			String sql="select * from ride";
			PreparedStatement pst=conn.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Rides r=new Rides();
				r.setRid(rs.getInt("rid"));
				r.setDid(rs.getInt("did"));
				r.setRideDate(rs.getString("date"));
				r.setDeparture(rs.getString("departure"));
				r.setExactDeparture(rs.getString("exactdeparture"));
				r.setDtime(rs.getString("dtime"));
				r.setArrival(rs.getString("arrival"));
				r.setExactArrival(rs.getString("exactarrival"));
				r.setAtime(rs.getString("atime"));
				r.setDistKm(rs.getInt("distkm"));
				r.setNoOfSeat(rs.getInt("noofseat"));
				r.setNoofseatfill(rs.getInt("noofseatfill"));
				r.setPrice(rs.getInt("price"));
				list.add(r);				
			}
			System.out.println("Get all ride ");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
