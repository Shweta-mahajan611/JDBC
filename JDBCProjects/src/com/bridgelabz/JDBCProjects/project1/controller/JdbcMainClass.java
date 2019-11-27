package com.bridgelabz.JDBCProjects.project1.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.bridgelabz.JDBCProjects.project1.srevices.QueriesImplClass;
/**
 * JDBC CRUD operations
 * @author Shweta Mahajan.
 *
 */
public class JdbcMainClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Scanner sc = new Scanner(System.in);
//		String url = "jdbc:mysql://localhost/shweta";
//		String uname = "root";
//		String pwd = "password";
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con = DriverManager.getConnection(url, uname, pwd);
//		Statement st =con.createStatement();
		
		QueriesImplClass qry = new QueriesImplClass();
		int ch=0;
		do {
			System.out.println();
			System.out.println("1. Add record of student");
			System.out.println("2. Delete record of student");
			System.out.println("3. Update student information");
			System.out.println("4. Update/Alter table student");
			System.out.println("5. Create Table");
			System.out.println("6. Truncate table");
			System.out.println("7. Drop table");
			System.out.println("8. Show Table");
			
			System.out.println("Enter your choice : ");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1: qry.addRecord();
				break;
			case 2: qry.deleteRecord();
				break;
			case 3: qry.updateValues();
				break;
			case 4: qry.alterTable();
				break;
			case 5: qry.createTable();
				break;
			case 6: qry.truncateTable();
				break;
			case 7: qry.dropTable();
				break;
			case 8: qry.showTable();
				break;
			default: System.out.println("Invalid choice");
				break;
			}
		}while(ch != 8);
	}

}
