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

public class FormServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String gender=req.getParameter("gender");
//		String html="<html>"
//				+ "<body>"
//				+ "<h1>id="+id+"</h1>"
//				+ "<h1>name="+name+"</h1>"
//				+ "<h1>age="+age+"</h1>"
//				+ "<h1>gender="+gender+"</h1>"
//				+ "</body>"
//				+ "</html>";
		PrintWriter out=res.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","root");
			PreparedStatement ps=c.prepareStatement("insert into user values(?,?,?,?)");
			ps.setInt(1, Integer.parseInt(id));
			ps.setString(2, name);
			ps.setInt(3, Integer.parseInt(age));
			ps.setString(4, gender);
			ps.executeUpdate();
			out.print("<h1>Data saved</h1>");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
