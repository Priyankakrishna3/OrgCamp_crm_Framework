package apitest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class Data3 {
	@Test
	public void sampleTest() throws Throwable
	{
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdata", "root", "admin");
		Statement stat = con.createStatement();
		String query="select * from students_info";
		
		String query1="insert into students_info (regno, firstName, middleName, lastName) values('5', 'aaa','bbb', 'c')";
		int res1 = stat.executeUpdate(query1);
		if(res1==1)
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
		ResultSet res = stat.executeQuery(query);
		while(res.next())
		{
			System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getString(3)+"\t"+res.getString(4));
		}
		
		con.close();
	

}
}
