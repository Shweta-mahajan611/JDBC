package com.bridgelabz.JDBCProjects.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * JDBC demo class 
 * @author Shweta Mahajan.
 *
 */
public class JDBCDemo 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String url = "jdbc:mysql://localhost/shweta";
		String uname = "root";
		String pwd = "password";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pwd);
		Statement st =con.createStatement();
		ResultSet rs = st.executeQuery("select * from students");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
		}
	}

}
