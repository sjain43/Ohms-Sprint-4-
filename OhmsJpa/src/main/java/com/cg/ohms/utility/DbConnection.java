package com.cg.ohms.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cg.ohms.exception.HMSException;

public class DbConnection {
	private static Connection connection;

	public static Connection getConnection() throws HMSException {

		if (connection == null) {
			try {
				connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			} catch (SQLException sql) {
				throw new HMSException(ExceptionMessage.SQL_MSG);
			}
		}
		return connection;
	}

}
