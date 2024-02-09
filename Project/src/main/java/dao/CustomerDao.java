package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

import connection.DBconnection;
import model.Customer;


public class CustomerDao {
	public static void registerCustomer(Customer u) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="insert into customer(name,contact,address,email,password) values(?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, u.getName());
			pst.setLong(2, u.getContact());			
			pst.setString(3, u.getAddress());
			pst.setString(4, u.getEmail());
			pst.setString(5, u.getPassword());
			pst.executeUpdate();
			System.out.println("Data insert succesfully");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	public static boolean checkRegisterEmail(String email) {
		boolean flag=false;
		try {
			Connection conn=DBconnection.createConnection();
			String sql="select * from customer where email=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs= pst.executeQuery();
			if(rs.next()) {
				flag=true;				
			}
			System.out.println("Email exist in database");
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return flag;
	}
	

	public static boolean checkEmail(String email) {
		boolean flag=false;
		try {
			Connection conn=DBconnection.createConnection();
			String sql="select * from customer where email=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs= pst.executeQuery();
			if(rs.next()) {
				flag=true;		
				System.out.println("Email exists");
			}else {
				System.out.println("Email doesn't exists");
			}
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		return flag;
		
	}
	public static Customer loginCustomer(String email,String pass) {
		Customer u=null;
		try {
			Connection conn=DBconnection.createConnection();
			String sql="select * from customer where email=? and password=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, email);
			pst.setString(2, pass);
			ResultSet rs= pst.executeQuery();
			if(rs.next()) {
				u=new Customer();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setContact(rs.getLong("contact"));
				u.setAddress(rs.getString("address"));
				u.setEmail(rs.getString("email"));
				u.setPassword(rs.getString("password"));
				System.out.println("Customer successfully logged id");
			}else {
				System.out.println("Password is incorrect");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return u;
		
	}
	public static void updateCustomerProfile(Customer u) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="update customer set name=?,contact=?,address=?,email=? where id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, u.getName());
			pst.setLong(2, u.getContact());			
			pst.setString(3, u.getAddress());
			pst.setString(4, u.getEmail());
			pst.setInt(5, u.getId());
			pst.executeUpdate();
			System.out.println("Data updated successfully");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean checkOldPass(int id,String op) {
		boolean flag=false;
		try {
			Connection conn=DBconnection.createConnection();
			String sql="select * from customer where id=? and password=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.setString(2, op);
			ResultSet rs= pst.executeQuery();
			if(rs.next()) {
				flag=true;
				System.out.println("old password exists");
			}else {
				System.out.println("old password doesn't exists");
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	public static void updatePassword(int id,String np) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="update customer set password=? where id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, np);
			pst.setInt(2, id);
			pst.executeUpdate();
			System.out.println("Password updated successfully");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void newPassword(String email,String np) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="update customer set password=? where email=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, np);
			pst.setString(2, email);
			pst.executeUpdate();
			System.out.println("Password updated successfully");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
