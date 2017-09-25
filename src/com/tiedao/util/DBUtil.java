package com.tiedao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	// 连接数据库的驱动类
		private static String driver = "com.mysql.jdbc.Driver";
		// 用户名
		private static String user = "root";
		// 密码
		private static String password = "123456";
		// URL
		private static String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF8";


	// Connection
	private static Connection conn;

	public static Connection getConnection() {
		// 加载驱动
		try {
			Class.forName(driver);
			// 获取连接对象
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// main ALT+/
	public static void main(String[] args) {
		System.out.println(getConnection());
	}
}
