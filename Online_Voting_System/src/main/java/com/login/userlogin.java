package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/userlogin")
public class userlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public userlogin()
    {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    
	    String name = request.getParameter("userfirstname");
	    
	    HttpSession session = request.getSession();
	    session.setAttribute("userfirstname", name);
		
		
	}

}
