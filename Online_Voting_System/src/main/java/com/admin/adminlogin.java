package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adminlogin")
public class adminlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
    	PrintWriter out =response.getWriter();
    	
    	String adminname = request.getParameter("adminname");
    	String adminpassword = request.getParameter("adminpassword");
    	
    	
    	try
    	{
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinevoting","root","1999");
    		String query = "insert into admin(adminname varchar(50) , adminpassword varchar(50)) ";
    		
    		PreparedStatement pstmt = con.prepareStatement(query);
    		
    		pstmt.setString(1, adminname);
    		pstmt.setString(2, adminpassword);
    		
    		int result = pstmt.executeUpdate();
    		RequestDispatcher dispatch = null;
    		if(result > 0)
    		{
    			out.println("<h2> inserted sucsessfully");
    			dispatch = request.getRequestDispatcher("result.jsp");
    			
    		}
    		else
    		{
    			dispatch = request.getRequestDispatcher("Admin_login.jsp");
    		}
    		
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
		
		
	}

}
