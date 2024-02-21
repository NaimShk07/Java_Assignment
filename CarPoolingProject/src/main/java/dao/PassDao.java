package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.DBconnection;
import model.Driver;
import model.Passenger;

public class PassDao {
	public static void registerPassenger(Passenger p) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="insert into passenger(name,number,age,address,email,password) values(?,?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, p.getName());
			pst.setLong(2, p.getNumber());
			pst.setInt(3, p.getAge());
			pst.setString(4, p.getAddress());
			pst.setString(5, p.getEmail());
			pst.setString(6, p.getPassword());
			pst.executeUpdate();
			System.out.println("passenger registered");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean checkEmail(String email) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="select * from passenger where email=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs =pst.executeQuery();
			while(rs.next()) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public static Passenger loginPassenger(String email,String password) {
		Passenger p=null;
		try {
			Connection conn=DBconnection.createConnection();
			String sql="select * from  passenger where email=? and password=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, email);
			pst.setString(2, password);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				p=new Passenger();
				p.setPid(rs.getInt("pid"));
				p.setName(rs.getString("name"));
				p.setNumber(rs.getLong("number"));
				p.setAge(rs.getInt("age"));
				p.setAddress(rs.getString("address"));
				p.setEmail(rs.getString("email"));
				p.setPassword(rs.getString("password"));
			}			
			pst.executeUpdate();
			System.out.println("passenger login");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}
	public static void updatePassenger(Passenger p) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="update passenger set name=?,number=?,age=?,address=?,email=?,password=? where pid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, p.getName());
			pst.setLong(2, p.getNumber());
			pst.setInt(3, p.getAge());
			pst.setString(4, p.getAddress());
			pst.setString(5, p.getEmail());
			pst.setString(6,p.getPassword());
			pst.setInt(7,p.getPid());
			pst.executeUpdate();
			System.out.println("passenger updated");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
