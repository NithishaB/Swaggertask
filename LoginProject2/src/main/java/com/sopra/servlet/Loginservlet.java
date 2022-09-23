package com.sopra.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sopra.beans.LoginForm;

import com.sopra.dao.LoginDao;

@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginDao ld;
	public void init()
	{
        ld = new LoginDao();
    }
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String empid = request.getParameter("empid");
		String name = request.getParameter("username");
		String date = request.getParameter("date");
		
		LoginForm log = new LoginForm();
		log.setEmpid(empid);
		log.setUsername(name);
		log.setDate(date);
		
		
		
		if(LoginDao.validate(log))
		{
			LoginDao.insert(log);
			RequestDispatcher req = request.getRequestDispatcher("index.jsp");
			req.forward(request, response);
			//session.setAttribute("loggedIn_username", name);
			//response.sendRedirect("index.jsp");
			
		}
		else
		{
			RequestDispatcher req = request.getRequestDispatcher("register.jsp");
			req.include(request, response);

			//response.sendRedirect("register.jsp");
		}
		
		
	}

}
