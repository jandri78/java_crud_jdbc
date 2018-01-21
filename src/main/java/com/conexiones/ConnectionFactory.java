package com.conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

		private String driverClassName = "com.mysql.jdbc.Driver";
		private String connectionUrl = "jdbc:mysql://localhost:3306/universidad";
		private String dbUser = "root";
		private String dbPwd = "";

		private static ConnectionFactory connectionFactory = null;

		private ConnectionFactory() {
			try {
				Class.forName(driverClassName);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}

		public Connection getConnection() throws SQLException {
			Connection conn = null;
			conn = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
			return conn;
		}

		public static ConnectionFactory getInstance() {
			if (connectionFactory == null) {
				connectionFactory = new ConnectionFactory();
			}
			return connectionFactory;
		}
	
}
