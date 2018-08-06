package lti.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 * 
 */
public class HelloServlet extends HttpServlet {
	private int counter;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		counter = 1001;
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//setting response MIME type
		response.setContentType("text/html");
		//getting response stream to write HTML output
		PrintWriter out = response.getWriter();
		//Writing html as output as response stream
		out.println("<body bgcolor=black text=tomato>");
		out.println("<h1>My name is Yk. I Love to sing</h1><hr>");
		out.println("<h2>Welcome to Servlet first program</h2>");
		Date now = new Date();
		out.println("<h3>Visit Time : "+now +"</h3>");
		out.println("<h2>Visitor number :"+counter++ +"</h3>");
		// Getting servlet config object from container
		ServletConfig config = getServletConfig();
		String author = config.getInitParameter("Author");//mapping is done using collection MAP
		out.println("<h3> Author :"+author+"</h3>");
		out.println("<h3> Servlet Name :"+config.getServletName()+"</h3>");
	}

}
