package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginServlet extends GenericServlet {
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		String email=req.getParameter("email");
		String pass=req.getParameter("password");
		String html="<html>"
				+ "<body>"
				+ "<h1>Email="+email+"</h1>"
				+ "<h1>Password="+pass+"</h1>"
				+ "</body>"
				+ "</html>";
		PrintWriter out=res.getWriter();
		out.printf(html);
	}
}
