package com.example.wen.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBConnectionTest {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/webemployee_tracker?useSSL=false";
		String user = "webemployee";
		String pass = "webemployee";
		try {
			System.out.println("connecting to db");
			Connection conn = DriverManager.getConnection(url, user, pass);
			System.out.println("connection granted");
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
