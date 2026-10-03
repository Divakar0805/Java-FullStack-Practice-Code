package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FetchByIdServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {
		String id = req.getParameter("id");

		PrintWriter out = res.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db", "root", "root");
			PreparedStatement ps = c.prepareStatement("SELECT * FROM user WHERE id = ?");
			ps.setInt(1, Integer.parseInt(id));
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				out.println("<h1>User Details</h1>");
				out.println("<h1>ID: " + rs.getInt(1) + "</h1>");
				out.println("<h1>Name: " + rs.getString(2) + "</h1>");
				out.println("<h1>Age: " + rs.getInt(3) + "</h1>");
				out.println("<h1>Gender: " + rs.getString(4) + "</h1>");
			} else {
				out.println("<h3>User not found!</h3>");
			}
			out.print("<h1>Data saved</h1>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
