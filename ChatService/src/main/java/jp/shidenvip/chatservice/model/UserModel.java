package jp.shidenvip.chatservice.model;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserModel
{
	private int id;
	private String loginId;
	private String password;
	private String email;
	
	private String name;
	
	private boolean validFlg;
	private boolean adminFlg;
	private boolean authFlg;
	
	private Date insertDate;
	
	public UserModel(ResultSet resultSet) throws SQLException
	{
		this.id = resultSet.getInt("id");
		this.loginId = resultSet.getString("loginId");
		this.password = resultSet.getString("password");
		this.email = resultSet.getString("email");
		
		this.name = resultSet.getString("name");
		
		this.validFlg = resultSet.getBoolean("validFlg");
		this.adminFlg = resultSet.getBoolean("adminFlg");
		this.authFlg = resultSet.getBoolean("authFlg");
		
		this.insertDate = resultSet.getDate("insertDate");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getValidFlg() {
		return validFlg;
	}

	public void setValidFlg(boolean validFlg) {
		this.validFlg = validFlg;
	}

	public boolean getAdminFlg() {
		return adminFlg;
	}

	public void setAdminFlg(boolean adminFlg) {
		this.adminFlg = adminFlg;
	}

	public boolean getAuthFlg() {
		return authFlg;
	}

	public void setAuthFlg(boolean authFlg) {
		this.authFlg = authFlg;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
}
