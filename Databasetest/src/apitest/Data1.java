package apitest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class Data1 {
	@Test
	public void sampleTest() throws Throwable
	{
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdata", "root", "admin");
		Statement stat = con.createStatement();
		String query="select * from students_info";
		ResultSet res = stat.executeQuery(query);
		while(res.next())
		{
			System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getString(3)+"\t"+res.getString(4));
		}
		con.close();
		//add
		
		
	}

}
