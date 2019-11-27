package com.bridgelabz.JDBCProjects.project1.srevices;

import java.sql.SQLException;
/**
 * interface for jdbc crud operations
 * @author Shweta Mahajan.
 *
 */
public interface Queries
{
	/**
	 * add record in table
	 * @throws SQLException 
	 */
	public void addRecord() throws SQLException;
	/**
	 * delete record from table according to condition
	 */
	public void deleteRecord();
	/**
	 * update values of table 
	 * @throws SQLException 
	 */
	public void updateValues() throws SQLException;
	/**
	 * update/alter table students
	 */
	public void alterTable();
	/**
	 * to delete data from table without structure	
	 * @throws SQLException 
	 */
	public void truncateTable() throws SQLException;
	/**
	 * to delete whole table with structure
	 */
	public void dropTable();
	/**
	 * serach and show record according to conditions
	 */
	public void search();
}
