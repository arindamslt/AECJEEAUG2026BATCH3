package model;
import java.sql.*;

import utilities.ConnectionFactory;

//import utilities.ConnectionFactory;
public class FoodDao {
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
   private String select_sql="select * from food";
	private String insert_sql="insert into food values(?,?,?)";
	private String delete_sql="delete from food where fid=?";
	private String update_sql="update food set fname=?,price=? where fid=?";
	
	public ResultSet getData()
	{
		try
		{
			 ConnectionFactory con=new ConnectionFactory();
			    cn=con.getConn();
		  st=cn.createStatement();//CREATE THE STATEMENT
		  rs=st.executeQuery(select_sql);//execute query and store data into resultset
		  
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		return rs;
	}
	public void updateData(String fid,String fname,double price)
	{
		try
		{
		    ConnectionFactory con=new ConnectionFactory();
		    cn=con.getConn();
		  ps=cn.prepareStatement(update_sql);
		  ps.setString(3,fid);
		  ps.setString(1,fname);
		 	 ps.setDouble(2,price);
		  ps.executeUpdate();//DATA SAVED INTO TABLE
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void deleteData(String fid)
	{ 
		try
		{
		    ConnectionFactory con=new ConnectionFactory();
		    cn=con.getConn();
		  ps=cn.prepareStatement(delete_sql);
		  ps.setString(1,fid);
		
		  ps.executeUpdate();//DATA SAVED INTO TABLE
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
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
