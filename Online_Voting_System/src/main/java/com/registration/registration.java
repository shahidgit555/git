package com.registration;

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




@WebServlet("/registration")
public class registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		String firstname = request.getParameter("userfirstname");
		String lastname = request.getParameter("userlastname");
		String phone = request.getParameter("phone");
		String cardnumber  = request.getParameter("votercardnumber");
		String dob  = request.getParameter("dateofbirth");
		String address = request.getParameter("address");
		
		
		HttpSession session = request.getSession();
		session.setAttribute("userfirstname", firstname);
		
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/onlinevoting";
			String username = "root";
			String password ="1999";
			Connection con = DriverManager.getConnection(url,username,password);
			
			String query ="insert into voting(firstname,lastname,phone,cardnumber,dob,address) values(?,?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, firstname);
			pstmt.setString(2, lastname);
			pstmt.setString(3, phone);
			pstmt.setString(4, cardnumber);
			pstmt.setString(5, dob);
			pstmt.setString(6, address);
			
			int result = pstmt.executeUpdate();
			RequestDispatcher dispatch = null;
			
			if(result > 0)
			{
				out.println("<h2>successfull register</h2");
				dispatch = request.getRequestDispatcher("userlogin");
				
			}
			else
			{
				out.println("<h2>something went wrongr</h2");
				dispatch = request.getRequestDispatcher("createAccount.jsp");
				
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
	
	}

}
