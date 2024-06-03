package com.example.demo;

import java.sql.*;

public class GetStudentData {

	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/studentManagementSystem";
		String user = "root";
		String pwd = "***";
		String query = "select * from Student";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, pwd);
		
		System.out.println("Connection Establised !!!");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			String name = rs.getString("StudentName");
			System.out.println(name);
		}
		
		st.close();
		con.close();
		System.out.println("Connection closed...");
				
	}
}
