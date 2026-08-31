package model;
import java.sql.*;

import utilities.ConnectionFactory;

//import utilities.ConnectionFactory;
public class FoodDao {
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	//private String select_sql="select * from product";
	private String insert_sql="insert into food values(?,?,?)";
	//private String delete_sql="delete from product where pid=?";
	//private String update_sql="update product set pname=?,pqty=?,price=? where pid=?";
	public void insertData(String fid,String fname,double price)
	{
		try
		{
		    ConnectionFactory con=new ConnectionFactory();
		    cn=con.getConn();
		  ps=cn.prepareStatement(insert_sql);
		  ps.setString(1,fid);
		  ps.setString(2,fname);
		 	 ps.setDouble(3,price);
		  ps.executeUpdate();//DATA SAVED INTO TABLE
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}

}
