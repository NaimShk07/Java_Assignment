package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import connection.DBconnection;
import model.Cart;


public class CartDao {
	public static void insertProdInCart(Cart c) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="insert into cart(pid,cusid,sid,pprice,qty,totalamount,pname,image,pcategory,pdesc,paymentstatus) values(?,?,?,?,?,?,?,?,?,?,?)"; 
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, c.getPid());
			pst.setInt(2,c.getCusid());
			pst.setInt(3,c.getSid());
			pst.setInt(4,c.getPprice());
			pst.setInt(5,c.getQty());
			pst.setInt(6,c.getTotalamt());
			pst.setString(7,c.getPname());
			pst.setString(8,c.getImage());
			pst.setString(9,c.getPcategory());
			pst.setString(10,c.getPdesc());
			pst.setString(11,c.getPaymentstatus());
			pst.executeUpdate();
			System.out.println("cart inserted successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<Cart> getCartItemByCusid(int cusid){
		List<Cart> list =new ArrayList<Cart>();
		try {
			Connection conn=DBconnection.createConnection();
			String sql="select * from cart where cusid=? and paymentstatus='pending'"; 
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, cusid);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Cart c=new Cart();
				c.setCartid(rs.getInt("cartid"));
				c.setPid(rs.getInt("pid"));
				c.setCusid(rs.getInt("cusid"));
				c.setSid(rs.getInt("sid"));
				c.setPprice(rs.getInt("pprice"));
				c.setQty(rs.getInt("qty"));
				c.setTotalamt(rs.getInt("totalamount"));
				c.setPname(rs.getString("pname"));
				c.setImage(rs.getString("image"));
				c.setPcategory(rs.getString("pcategory"));
				c.setPdesc(rs.getString("pdesc"));
				c.setPaymentstatus(rs.getString("paymentstatus"));
				list.add(c);
				System.out.println("all cart prod fetched");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static boolean checkProdCart(int cusid,int pid) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="select * from cart where cusid=? and pid=? and paymentstatus='pending' "; 
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, cusid);
			pst.setInt(2, pid);
			ResultSet rs= pst.executeQuery();
			while(rs.next()) {
				return false;
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	public static void deleteCart(int cartid) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="delete from cart where cartid=? "; 
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, cartid);
			pst.executeUpdate();
			System.out.println("cart item deleted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void updateCart(Cart c) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="update cart set qty=?,totalamount=? where cartid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, c.getQty());
			pst.setInt(2,c.getTotalamt());
			pst.setInt(3, c.getCartid());
			pst.executeUpdate();
			System.out.println("cart updated");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Cart getSingleCartByCusId(int cusid) {
		Cart c=null;
		try {
			Connection conn=DBconnection.createConnection();
			String sql="select * from cart where cusid=? and paymentstatus='pending'";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, cusid);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				c=new Cart();
				c.setCartid(rs.getInt("cartid"));
				c.setPid(rs.getInt("pid"));
				c.setCusid(rs.getInt("cusid"));
				c.setSid(rs.getInt("sid"));
				c.setPprice(rs.getInt("pprice"));
				c.setQty(rs.getInt("qty"));
				c.setTotalamt(rs.getInt("totalamount"));
				c.setPname(rs.getString("pname"));
				c.setImage(rs.getString("image"));
				c.setPcategory(rs.getString("pcategory"));
				c.setPdesc(rs.getString("pdesc"));
				c.setPaymentstatus(rs.getString("paymentstatus"));
				System.out.println("fetched one single cart");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}
	public static void updateStatus(int cartid) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="update cart set paymentstatus='successful' where cartid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, cartid);
			pst.executeUpdate();
			System.out.println("payment status updated");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
