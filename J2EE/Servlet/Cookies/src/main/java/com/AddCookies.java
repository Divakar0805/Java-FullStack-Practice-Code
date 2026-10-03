package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addcookie")
public class AddCookies extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		Cookie c1=new Cookie("email","diva@gmail.com");
		c1.setMaxAge(60*10);
		Cookie c2=new Cookie("password","123");
		c2.setMaxAge(60);
		res.addCookie(c1);
		res.addCookie(c2);
		PrintWriter out=res.getWriter();
		out.print("<h1>Cookies Added</h1>");
	}

}
