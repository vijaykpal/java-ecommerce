package ecommerce;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;


public class DatabaseOperation{
     Connection con;
     DetailsDto dt;
	
	public void signup(String name,String mob,String password)  throws SQLException
	
	{
		con=Database.getConnection();
	  System.out.println(name + "" + mob +"" + password);
		try {
		
		   PreparedStatement ps=con.prepareStatement("insert into signup(name,mobile,password) values(?,?,?)");
			ps.setString(1,name);
			ps.setString(2, mob);
			ps.setString(3,password);
			ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		}
	public DetailsDto signin(String name,String pass) throws SQLException
	{
		int flag=0;
		con=Database.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from signup where name=? and password=?");
		ps.setString(1,name);
		ps.setString(2, pass);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{   
			dt=new DetailsDto();
			dt.setName(rs.getString(1));
			dt.setRoll(rs.getString(2));
			
		}
	return dt;
	}

}
