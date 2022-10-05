package DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DB.DBConnect;
import BEAN.User;

public class LoginDAO {

	public static User Login(Connection conn, String user, String password) throws SQLException,
    ClassNotFoundException  {

		String sqlString = "select * from web.login where user=? and password=? ";

		PreparedStatement statement = conn.prepareStatement(sqlString);
		statement.setString(1, user);
		statement.setString(2, password);

		ResultSet result = statement.executeQuery();

		User user1 = new User();

		if (result.next()) {
			
			user1.setUserString(result.getString("user"));
			user1.setPasswordString(result.getString("password"));
			user1.setCategory(result.getInt("id"));
		}

		conn.close();
		return user1;
	}

}
