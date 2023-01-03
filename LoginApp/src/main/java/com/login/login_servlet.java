package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.loginDao.loginDao;

@WebServlet("/login_servlet")
public class login_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public login_servlet() {
        super();

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String name=request.getParameter("username");
		String password = request.getParameter("userpassword");
		
		
		loginDao dao = new loginDao();
		
		if(dao.check(name, password))
		{
			out.println("<h2>Welcome "+name+ "<br>you are login..</h2>");
	    	HttpSession session = request.getSession();
	    	session.setAttribute("username", name);
	    	request.getRequestDispatcher("profile.jsp").forward(request, response);
	    	
	    }
	    else
	    {
	    	out.println("<h5>sorry username and password are not matched</h5>");
	    	request.getRequestDispatcher("login.jsp").include(request, response);
	    	
	    }
		}
		
		
		
	}


