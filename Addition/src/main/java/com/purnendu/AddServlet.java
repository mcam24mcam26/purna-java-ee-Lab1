package com.purnendu;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;

public class AddServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		PrintWriter out=res.getWriter();
		out.println("The result is "+k);
		out.println("Number of time the web page is visited is "+Count.pageCount());
	}
}

class Count {
	public static int count=0;
	public static int pageCount() {
		return ++count;
	}
	
}
