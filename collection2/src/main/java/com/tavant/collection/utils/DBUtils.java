package com.tavant.collection.utils;

import java.sql.Connection;
import java.util.Properties;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DBUtils {
	private FileUtils fileUtils = FileUtils.getInstance();
	private static DBUtils dbUtils;

	private DBUtils() {

	}

	public static DBUtils getInstance() {

		if (dbUtils == null) {
			synchronized (DBUtils.class) {
				if (dbUtils == null) {
					dbUtils = new DBUtils();
				}
			}
		}

		return dbUtils;
	}

	public MysqlDataSource getDataSource() {
		MysqlDataSource dataSource = new MysqlDataSource();
		Properties properties = fileUtils.getProperties();
		
		return dataSource;
	}

	public void closeConnection(Connection connection) {

	}

	public Connection getConnection() {
		return null;
	}
}
