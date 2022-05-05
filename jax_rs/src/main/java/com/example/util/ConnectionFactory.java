package com.example.util;
import java.sql.*;
import java.util.ResourceBundle;

public class ConnectionFactory {

	public static Connection getOracleConnection() {
		
	Connection con=null;
	ResourceBundle labels=ResourceBundle.getBundle("application");
		
	try {
	con=DriverManager.getConnection(labels.getString("datasource.oracle.url")
	,labels.getString("datasource.oracle.username"),
		labels.getString("datasource.oracle.password"));
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;	
	}
	
	public static Connection getPostGressConnection()
	{
		Connection con=null;
		ResourceBundle labels=ResourceBundle.getBundle("application");
			
		try {
con=DriverManager.getConnection(labels.getString("datasource.postgres.url"),
	labels.getString("datasource.postgres.username"),
labels.getString("datasource.postgres.password"));
	//con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/test"
	//	,"postgres","abc123");	
			} 		
 catch (SQLException e){

	e.printStackTrace();
			}
		
		return con;
	}
}
