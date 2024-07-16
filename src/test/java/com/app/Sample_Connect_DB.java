package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample_Connect_DB {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306", "root", "Saikalai@123");
		System.out.println("connected");
		Statement statement = conn.createStatement();
		String query ="select max(Population) as maxPopulation from world.city ;";
		ResultSet rs = statement.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getString("maxPopulation"));
		}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
