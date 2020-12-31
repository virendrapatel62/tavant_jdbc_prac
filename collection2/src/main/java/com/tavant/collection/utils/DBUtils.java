package com.tavant.collection.utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysql.cj.jdbc.MysqlDataSource;

@Component
public class DBUtils {
	@Autowired
	private FileUtils fileUtils;

	public MysqlDataSource getDataSource() {
		MysqlDataSource dataSource = new MysqlDataSource();
		Properties properties = fileUtils.getProperties();

		String serverName = properties.getProperty("db.servername");
		String port = properties.getProperty("db.port");
		String password = properties.getProperty("db.password");
		String username = properties.getProperty("db.username");
		String databaseName = properties.getProperty("db.databasename");

		dataSource.setServerName(serverName);
		dataSource.setPort(Integer.parseInt(port));
		dataSource.setPassword(password);
		dataSource.setUser(username);
		dataSource.setDatabaseName(databaseName);
		try {
			dataSource.setSslMode("DISABLED");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dataSource;
	}

	public void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection connection = null;

		try {
			connection = getDataSource().getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
