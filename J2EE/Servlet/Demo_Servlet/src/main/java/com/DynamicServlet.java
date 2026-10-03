package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DynamicServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		Date d=new Date();
		String html="<html>"
				+ "<body>"
				+ "<h1>Current Date and time="+d+"</h1>"
				+ "</body>"
				+ "</html>";
		PrintWriter out=res.getWriter();
		
		out.print(html);

	}

}
