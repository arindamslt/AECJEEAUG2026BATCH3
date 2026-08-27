package jdbc;
import java.sql.*;
class TestConnection
{
	private Connection cn=null;
	private Statement st=null;
	private ResultSet rs=null;
	private String select_sql="select * from product";
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
			 System.out.println(rs.getString(1));
			 System.out.println(rs.getString(2));
			 System.out.println(rs.getInt(3));
			 System.out.println(rs.getDouble(4));
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
   ts.getData();
	}

}
