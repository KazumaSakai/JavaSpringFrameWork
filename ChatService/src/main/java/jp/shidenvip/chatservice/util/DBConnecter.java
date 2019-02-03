package jp.shidenvip.chatservice.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnecter
{
	private static final String driverName = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost/ChatService";
	private static final String user = "root";
	private static final String password = "mysql";
	
	public static Connection getConnection()
	{
		Connection connection = null;
		
		try
		{
			Class.forName(driverName);
			connection = (Connection) DriverManager.getConnection(url, user, password);
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return connection;
	}
}
