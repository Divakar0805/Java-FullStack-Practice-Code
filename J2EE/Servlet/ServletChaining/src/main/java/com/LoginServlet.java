package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet ( "/login")
public class LoginServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		PrintWriter out = res.getWriter();
		
		if(email.equals("dimple@gmail.com")) {
			if(pass.equals("890")) {
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("Home.html");
				dispatcher.include(req, res);
			}else {
				out.print("<h1> incorrect passwod</h1>");
				RequestDispatcher dispatcher = req.getRequestDispatcher("Login.html");
				dispatcher.include(req, res);
			} 
		}else {
			out.print("<h1> Email is not found <h1>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("Login.html");
			dispatcher.include(req, res);
		}
		
	}

}
