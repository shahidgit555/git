package com.profile;

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
import javax.servlet.http.HttpSession;

@WebServlet("/profile")
public class profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public profile() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    
	    String voterid = request.getParameter("voterid");
	    
	    String party = request.getParameter("party");
	    
	    HttpSession session = request.getSession();
	    session.getAttribute("userfirstname");
	    
	    
	    
	    	try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/onlinevoting";
				String username = "root";
				String password ="1999";
				Connection con = DriverManager.getConnection(url,username,password);
				
				String query ="insert into voteparty(voterid , party) values(?,?)";
				PreparedStatement pstmt = con.prepareStatement(query);
				
	
				pstmt.setString(1, voterid);
				pstmt.setString(2, party);
				
				
				int result = pstmt.executeUpdate();
				RequestDispatcher dispatch = null;
				
				if(result > 0)
				{
					out.println("<h2>vote sucessfully</h2");
					
					
				}
				else
				{
					out.println("<h2>something went wrongr</h2");
					dispatch = request.getRequestDispatcher("profile.jsp");
					
				}
	    	
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    
		
		
	}

}
