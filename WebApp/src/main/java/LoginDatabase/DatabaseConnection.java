package LoginDatabase;

import java.sql.*;  


public class DatabaseConnection {

	public static Connection getConnection() {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/mydb","root","12345");
		
		return con;
		}
		catch(Exception e){System.out.println(e);}
		return null; 
	}
	
	
}
