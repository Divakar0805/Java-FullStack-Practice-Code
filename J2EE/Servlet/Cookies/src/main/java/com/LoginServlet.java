package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String pass=req.getParameter("password");
		PrintWriter out=resp.getWriter();
		if(email.equals("diva@gmail.com")) {
			if(pass.equals("8520")) {
				HttpSession session=req.getSession(true);
				out.print("<h1>Login Sucessfull!!!!</h1>");
			}else {
				out.print("<h1>Incorrect Password</h1>");
				RequestDispatcher dispatcher=req.getRequestDispatcher("Login.html");
				dispatcher.include(req, resp);
			}
		}else {
			out.print("<h1>Email Not Found</h1>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("Login.html");
			dispatcher.include(req, resp);
		}
	}
}
