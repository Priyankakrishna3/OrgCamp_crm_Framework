package apitest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class Data2 {
	Connection con;
	@Test
	public void sampleTest() throws Throwable
	{
		try
		{
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdata", "root", "admin");
		Statement stat = con.createStatement();
		String query="select * from students_info";
		String query1="insert into students_info (regno, firstName, middleName, lastName) values('4', 'aaa','bbb', 'c')";
		int res = stat.executeUpdate(query1);
		if(res==1)
		{
			System.out.println("data is inserted");
		}
		}
		catch(Exception e)
		{
		
		
			System.err.println("data is not inserted");
		}
		
		finally
		{
		
		con.close();

}
}
}

