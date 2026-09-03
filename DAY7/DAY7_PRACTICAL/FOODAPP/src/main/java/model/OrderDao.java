package model;
import java.sql.*;

import utilities.ConnectionFactory;
public class OrderDao {
	private Connection cn=null;
	private PreparedStatement ps=null;
	private String insert_sql="insert into orderdtls(fid,qty,uname) values(?,?,?)";
	public void insertData(String fid,double qty,String uname)
	{
		try
		{
		    ConnectionFactory con=new ConnectionFactory();
		    cn=con.getConn();
		  ps=cn.prepareStatement(insert_sql);
		  ps.setString(1,fid);
		  ps.setDouble(2,qty);
		  ps.setString(3,uname);
		 	
		  ps.executeUpdate();//DATA SAVED INTO TABLE
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}

}
