package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import connection.DBconnection;
import model.Product;

public class ProductDao {
	public static void uploadProduct(Product p) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="insert into product(sid,image,pname,pprice,pcategory,pdesc) values(?,?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1,p.getSid());
			pst.setString(2,p.getImage());
			pst.setString(3,p.getPname());
			pst.setInt(4,p.getPprice());
			pst.setString(5,p.getPcategory());
			pst.setString(6,p.getPdesc());
			pst.executeUpdate();
			System.out.println("Product uploaded");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<Product> getProductListBySid(int id){
		List<Product> list=new ArrayList<Product>();
		try {
			Connection conn=DBconnection.createConnection();
			String sql="select * from product where sid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs= pst.executeQuery();
			while(rs.next()) {
				Product p=new Product();
				p.setPid(rs.getInt("pid"));
				p.setSid(rs.getInt("sid"));
				p.setImage(rs.getString("image"));
				p.setPname(rs.getString("pname"));
				p.setPdesc(rs.getString("pdesc"));
				p.setPcategory(rs.getString("pcategory"));
				p.setPprice(rs.getInt("pprice"));
				list.add(p);				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static Product getProductByPid(int id){
		Product p = null;
		try {
			Connection conn=DBconnection.createConnection();
			String sql="select * from product where pid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs= pst.executeQuery();
			while(rs.next()) {
				p=new Product();
				p.setPid(rs.getInt("pid"));
				p.setSid(rs.getInt("sid"));
				p.setImage(rs.getString("image"));
				p.setPname(rs.getString("pname"));
				p.setPdesc(rs.getString("pdesc"));
				p.setPcategory(rs.getString("pcategory"));
				p.setPprice(rs.getInt("pprice"));								
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return p;
	}
	public static void updateProduct(Product p) {
		
		try {
			Connection conn=DBconnection.createConnection();
			String sql="update product set pname=?,pprice=?,pcategory=?,pdesc=? where pid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			
			pst.setString(1, p.getPname());
			pst.setInt(2, p.getPprice());
			pst.setString(3, p.getPcategory());
			pst.setString(4, p.getPdesc());
			pst.setInt(5, p.getPid());
			
			pst.executeUpdate();
			System.out.println("Product updated successfully");
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void deleteProduct(int pid) {
		try {
			Connection conn=DBconnection.createConnection();
			String sql="delete from product where pid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, pid);
			pst.executeUpdate();
			System.out.println("Product delete successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<Product> getAllProduct(){
		List<Product> list=new ArrayList<Product>();
		try {
			Connection conn=DBconnection.createConnection();
			String sql="select * from product";
			PreparedStatement pst=conn.prepareStatement(sql);			
			ResultSet rs= pst.executeQuery();
			while(rs.next()) {
				Product p=new Product();
				p.setPid(rs.getInt("pid"));
				p.setSid(rs.getInt("sid"));
				p.setImage(rs.getString("image"));
				p.setPname(rs.getString("pname"));
				p.setPdesc(rs.getString("pdesc"));
				p.setPcategory(rs.getString("pcategory"));
				p.setPprice(rs.getInt("pprice"));
				list.add(p);	
			}
			System.out.println("Got Product successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
