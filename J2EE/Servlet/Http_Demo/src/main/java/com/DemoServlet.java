package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/demo")
public class DemoServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		PrintWriter out=res.getWriter();
		out.print("<h1>Hi This is Get Method</h1>");
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		PrintWriter out=res.getWriter();
		out.print("<h1>Hi This is Post Method</h1>");
	}
	public void doPut(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		PrintWriter out=res.getWriter();
		out.print("<h1>Hi This is Post Method</h1>");
	}
}
