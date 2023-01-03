package com.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;


@WebServlet("/Registration_servlet")
public class Registration_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Registration_servlet() {
        super();
       
    }	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<h2>this is Registration servlet page</h2>");
		
		String name=request.getParameter("username");
		String password = request.getParameter("userpassword");
		String email = request.getParameter("useremail");
		String phone = request.getParameter("userphone");
	
	  
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationform","root","1999");
			
			String query ="insert into user(name ,password,email,phone) values(?,?,?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			pstmt.setString(3, email);
			pstmt.setString(4, phone);
			
		   int result =pstmt.executeUpdate();
		   
		   RequestDispatcher dispatch = null;
		   
		   if(result > 0)
		   {
			   out.println("<h2>sucessfully register</h2>");
			   dispatch = request.getRequestDispatcher("login.jsp");
		   }
		   else
		   {
			   dispatch = request.getRequestDispatcher("Registration.jsp"); 
		   }
		   
		   dispatch.forward(request, response);
		   
		   con.close();
		 }
		 catch(Exception e)
		 {
			e.printStackTrace();
		 }
		
	}
		
		  
		}
		
		

		
		
		


