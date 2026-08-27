package jdbc;
import java.sql.*;
class TestConnection
{
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String select_sql="select * from product";
	private String insert_sql="insert into product values(?,?,?,?)";
	private String delete_sql="delete from product where pid=?";
	private String update_sql="update product set pname=?,pqty=?,price=? where pid=?";
	public void updateData()
	{
		try
		{
		//REGISTER AND LOAD THE JDBC DRIVER
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  //ESTABLISH THE CONNECTION
		  cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jeesd","root","arindam");
		  ps=cn.prepareStatement(update_sql);
		  ps.setString(4,"P2");
		  ps.setString(1,"LAPTOP");
		  ps.setInt(2,12);
		  ps.setDouble(3,45000.00);
		  ps.executeUpdate();//DATA SAVED INTO TABLE
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void deleteData()
	{
		try
		{
		//REGISTER AND LOAD THE JDBC DRIVER
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  //ESTABLISH THE CONNECTION
		  cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jeesd","root","arindam");
		  ps=cn.prepareStatement(delete_sql);
		  ps.setString(1,"P3");
		  ps.executeUpdate();//DATA SAVED INTO TABLE
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void insertData()
	{
		try
		{
		//REGISTER AND LOAD THE JDBC DRIVER
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  //ESTABLISH THE CONNECTION
		  cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jeesd","root","arindam");
		  ps=cn.prepareStatement(insert_sql);
		  ps.setString(1,"P3");
		  ps.setString(2,"TAB");
		  ps.setInt(3,2);
		  ps.setDouble(4,22000.00);
		  ps.executeUpdate();//DATA SAVED INTO TABLE
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	
	public void getData()
	{
		try
		{
		//REGISTER AND LOAD THE JDBC DRIVER
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  //ESTABLISH THE CONNECTION
		  cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jeesd","root","arindam");
		  st=cn.createStatement();//CREATE THE STATEMENT
		  rs=st.executeQuery(select_sql);//execute query and store data into resultset
		  while(rs.next())
		  {
			 //System.out.println(rs.getString(1));
			// System.out.println(rs.getString(2));
			// System.out.println(rs.getInt(3));
			 //System.out.println(rs.getDouble(4));
			  System.out.println(rs.getString(1)+"==>"+rs.getString(2)+"===>"+rs.getInt(3)+"===>"+rs.getDouble(4));
		  }
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
public class JavaMysqlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   TestConnection ts=new TestConnection();
   //ts.insertData();
  // ts.deleteData();
   //ts.updateData();
   ts.getData();
	}

}
