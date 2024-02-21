package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.DBconnection;
import model.Driver;


public class DriverDao {
	public static void registerDriver(Driver d) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="insert into driver(name,number,age,address,email,password,vname) values(?,?,?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, d.getName());
			pst.setLong(2, d.getNumber());
			pst.setInt(3, d.getAge());
			pst.setString(4, d.getAddress());
			pst.setString(5, d.getEmail());
			pst.setString(6,d.getPassword());
			pst.setString(7, d.getVname());
			pst.executeUpdate();
			System.out.println("driver registered");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean checkEmail(String email) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="select * from driver where email=?";
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
	public static Driver loginDriver(String email,String password) {
		Driver d=null;
		try {
			Connection conn=DBconnection.createConnection();
			String sql="select * from  driver where email=? and password=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, email);
			pst.setString(2, password);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				d=new Driver();
				d.setDid(rs.getInt("did"));
				d.setName(rs.getString("name"));
				d.setNumber(rs.getLong("number"));
				d.setAge(rs.getInt("age"));
				d.setAddress(rs.getString("address"));
				d.setEmail(rs.getString("email"));
				d.setPassword(rs.getString("password"));
				d.setVname(rs.getString("vname"));
			}			
			pst.executeUpdate();
			System.out.println("Driver login");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}
	public static void updateDriver(Driver d) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="update driver set name=?,number=?,age=?,address=?,email=?,password=?,vname=? where did=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, d.getName());
			pst.setLong(2, d.getNumber());
			pst.setInt(3, d.getAge());
			pst.setString(4, d.getAddress());
			pst.setString(5, d.getEmail());
			pst.setString(6,d.getPassword());
			pst.setString(7, d.getVname());
			pst.setInt(8,d.getDid());
			pst.executeUpdate();
			System.out.println("driver updated");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Driver getDriverInfo(int did) {
		Driver d=null;
		try {
			Connection conn=DBconnection.createConnection();
			String sql="select * from driver where did=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, did);
			ResultSet rs= pst.executeQuery();
			while(rs.next()) {
				d=new Driver();
				d.setName(rs.getString("name"));
				d.setVname(rs.getString("vname"));
			}
			System.out.println("got driver info");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}

}
