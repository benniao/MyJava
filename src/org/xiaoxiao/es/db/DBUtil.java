package org.xiaoxiao.es.db;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static String dbHost;
	private static String dbPort;
	private static String dbName;
	private static String dbUser;
	private static String dbPassword;
	static {
		try {
			InputStream dbIn = DBUtil.class
					.getResourceAsStream("/db.properties");
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					dbIn));

			int pos = 0;
			String line = reader.readLine();
			pos = line.indexOf("=") + 1;
			dbHost = line.substring(pos);

			line = reader.readLine();
			pos = line.indexOf("=") + 1;
			dbPort = line.substring(pos);

			line = reader.readLine();
			pos = line.indexOf("=") + 1;
			dbName = line.substring(pos);

			line = reader.readLine();
			pos = line.indexOf("=") + 1;
			dbUser = line.substring(pos);

			line = reader.readLine();
			pos = line.indexOf("=") + 1;
			dbPassword = line.substring(pos);

			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Connection createConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
			Connection connection = DriverManager.getConnection(url, dbUser,
					dbPassword);
			return connection;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
