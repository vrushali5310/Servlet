package com.stock.Util;

import java.sql.Connection;
import java.sql.DriverManager;


public class StockUtil 
{
	public static Connection getConnection()
	{
	Connection con = null;
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","vrush@123");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return con;
}

}
