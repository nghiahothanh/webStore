package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	public static Connection getConnection() throws SQLException, ClassNotFoundException {

		Connection connection = null;

		String urlString = "jdbc:mysql://localhost:3306/web";
		String usernameString = "root";
		String passwordString = "032003";

		Class.forName("com.mysql.jdbc.Driver");

		connection = DriverManager.getConnection(urlString, usernameString, passwordString);

		return connection;

	}
}
