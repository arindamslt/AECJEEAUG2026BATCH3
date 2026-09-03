package model;
import java.sql.*;

import utilities.ConnectionFactory;
public class RegisterDao {
	private Connection cn=null;
	//private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
  	private String insert_sql="insert into register values(?,?,?)";
  	private String check_login_sql="select * from register where uname=? and pass=?";
  	public boolean checkLogin(String uname,String pass )
  	{
  		boolean flag=false;
  		try
		{
		    ConnectionFactory con=new ConnectionFactory();
		    cn=con.getConn();
		  ps=cn.prepareStatement(check_login_sql);
		  ps.setString(1,uname);
		  ps.setString(2,pass);
		  	rs=	ps.executeQuery();
		  	if(rs.next())
		  	{
		  		flag=true;
		  	}
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
  		return flag;
  	}
  	public void insertData(String uname,String pass,String nm)
	{
		try
		{
		    ConnectionFactory con=new ConnectionFactory();
		    cn=con.getConn();
		  ps=cn.prepareStatement(insert_sql);
		  ps.setString(1,uname);
		  ps.setString(2,pass);
		  ps.setString(3,nm);
		 ps.executeUpdate();//DATA SAVED INTO TABLE
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
