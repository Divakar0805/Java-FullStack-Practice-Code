package com;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifeCycleServlet extends GenericServlet  {
	@Override
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		System.out.println("Hi this is Service Method");
	}
	public void init() {
		System.out.println("Hi this is init Method");
	}
	public void destroy() {
		System.out.println("Hi this is Destroy Method");
	}

}
