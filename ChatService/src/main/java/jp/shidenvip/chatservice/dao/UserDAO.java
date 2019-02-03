package jp.shidenvip.chatservice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jp.shidenvip.chatservice.model.UserModel;

public class UserDAO
{
	public static UserModel getUser(Connection connection, String loginId)
	{
		String sql = "SELECT * FROM userTable WHERE loginId = ?";
		
		UserModel userModel = null;
		
		try
		{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginId);

			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next())
			{
				userModel = new UserModel(resultSet);
			}
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return userModel;
	}
}
