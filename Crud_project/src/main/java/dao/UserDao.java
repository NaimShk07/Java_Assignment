package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBconnection;
import user.User;

public class UserDao {
	public static void createUser(User u) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="insert into user(name,number,email,password) values(?,?,?,?)";
			PreparedStatement pst =conn.prepareStatement(sql);
			pst.setString(1,u.getName());
			pst.setLong(2,u.getNumber());
			pst.setString(3, u.getEmail());
			pst.setString(4, u.getPassword());
			pst.executeUpdate();
			System.out.println("Data inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<User> getAllUser(){
		List<User> list=new ArrayList<>();
		try {
			Connection conn=DBconnection.createConnection();
			String sql="select * from user";
			PreparedStatement pst =conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				User u=new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setNumber(rs.getLong("number"));
				u.setEmail(rs.getString("email"));
				u.setPassword(rs.getString("password"));
				list.add(u);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public static User getUserById(int id) {
		User u=null;
		try {
			Connection conn=DBconnection.createConnection();
			String sql="select * from user where id=?";
			PreparedStatement pst =conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs= pst.executeQuery();
			while(rs.next()) {
				u=new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setNumber(rs.getLong("number"));
				u.setEmail(rs.getString("email"));
				u.setPassword(rs.getString("password"));				
			}		
			System.out.println("get one user data");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}
	public static void deleteUser(int id) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="delete from user where id=?";
			PreparedStatement pst =conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
			System.out.println("user deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void updateUser(User u) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="update user set name=?,number=?,email=?,password=? where id=?";
			PreparedStatement pst =conn.prepareStatement(sql);
			pst.setString(1,u.getName());
			pst.setLong(2,u.getNumber());
			pst.setString(3, u.getEmail());
			pst.setString(4, u.getPassword());
			pst.setInt(5,u.getId());
			pst.executeUpdate();
			System.out.println("user updated");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
