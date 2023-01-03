package com.loginDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class loginDao
{
	
		public boolean check(String name , String password)
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationform","root","1999");
				String query ="select * from user where name=? and password=?";
				PreparedStatement stmt = con.prepareStatement(query);
				
				stmt.setString(1, name);
				stmt.setString(2, password);
				
			ResultSet rs =stmt.executeQuery();
			
			if(rs.next())
			{
				return true;
			}
				
			} catch (Exception e) {

				e.printStackTrace();
			}			
			return false;
		}

}
