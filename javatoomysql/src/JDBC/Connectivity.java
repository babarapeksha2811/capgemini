package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Connectivity {

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Capgemini","root","Apeksha");
			Statement st=(Statement) conn.createStatement();
	    //	String str="insert into itemployee values(105,'Apeksha',29,'Developer',34000,'NULL')";
		//	st.executeUpdate(str);
	   //	String str1="update itemployee set eage=30 where ename='Apeksha'";
	  //	st.executeUpdate(str1);
			String str1="delete from itemployee where ename='Apeksha'";
			st.executeUpdate(str1);
			ResultSet rset=st.executeQuery("select * from itemployee");
			while(rset.next())
			{
				System.out.println(rset.getString(1)+"\t"+rset.getString(2)+"\t"+rset.getString(3)+"\t"+rset.getString(4)+"\t"+rset.getString(5)+"\t"+rset.getString(6)); 
			}
			
		} catch (Exception e) 
		{
			System.out.println("The error are:   " + e);
		}

	}

}