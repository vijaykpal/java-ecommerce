package ecommerce;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Database {
	private static Connection con;
	public static Connection getConnection() throws SQLException{
  try {
	Class.forName("com.mysql.jdbc.Driver");
	
   con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/ecom","root","root");
   System.out.println("connected");
} catch (ClassNotFoundException e) {
	System.out.println("not connected");
}
return  con;
}
}





