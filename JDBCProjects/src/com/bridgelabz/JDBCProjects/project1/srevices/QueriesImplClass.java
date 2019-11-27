package com.bridgelabz.JDBCProjects.project1.srevices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * class to implements queries interface
 * @author Shweta Mahajan.
 */
public class QueriesImplClass implements Queries
{
	/**
	 * to create connection with database
	 * @return
	 * @throws Exception
	 */
	public Connection connection() throws Exception 
	{
		
		 String url = "jdbc:mysql://localhost/shweta";
		 String uname = "root";
		 String pwd = "password";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pwd);
		return  con;
		
	}
	
   
	String query="";
	public void createTable()
	{
		try {
			query = "create table studentinfo(sid int,firstname varchar(20),lastname varchar(30),address varchar(30),percentage int)"; 
			//query = "create table studentinfo like students";		
			Statement st = connection().createStatement();
			st.execute(query);
			showTable();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	/**
	 * add record in table students
	 * @throws SQLException 
	 * @throws Exception 
	 */
	@Override
	public void addRecord() 
	{
		try {
		query = "insert into students values(6,'neha','padge','solapur',60,'solapur')";
		PreparedStatement ps = connection().prepareStatement(query);
		ps.execute();
		showTable();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * delete record from table students
	 * @throws SQLException 
	 */
	@Override
	public void deleteRecord() 
	{
		try {
		query = "delete from students where sid = 6";
		PreparedStatement ps = connection().prepareStatement(query);
		ps.executeUpdate();
		showTable();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * update info of student
	 */
	public void updateValues()
	{
		try {
		query = "update students set firstname = 'shraddha' where sid = 7";	
		PreparedStatement ps = connection().prepareStatement(query);
		ps.executeUpdate();
		showTable();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	/**
	 * to delete data from table 
	 */
	@Override
	public void truncateTable() 
	{
		try {
		query = "truncate table student";
		Statement st = connection().createStatement();
		st.execute(query);
		showTable();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * to delete data from table with structure
	 */
	@Override
	public void dropTable() 
	{
		try {
		query = "drop table student";
		Statement st = connection().createStatement();
		st.execute(query);
		showTable();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * search data according to condition
	 */
	public void search()
	{
		try {
		query = "select * from students where percentage = 65";
		PreparedStatement ps = connection().prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * update/alter table students
	 */
	public void alterTable() 
	{
		try {
		query = " alter table students add city varchar(30)";
		Statement st = connection().createStatement();
	    st.execute(query);
		showTable();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * to show table students
	 */
	public void showTable() 
	{
		try {
			query = "select * from students";
			PreparedStatement ps = connection().prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
			}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}

}
