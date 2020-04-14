package userDetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter obj = res.getWriter();
		
		//Reading cookies
	    Cookie cookies[]=req.getCookies(); 
	    
	    obj.println("<h3>User Login Details</h3>");
	    for(Cookie c : cookies)
	    {
	    	if(c.getName().equals("userName"))
	    	{
	    		 //Displaying User name value from cookie
	    		obj.println("<b>Name: </b>"+c.getValue());
	    	}
	    	if(c.getName().equals("userPassword"))
	    	{
	    		 //Displaying user password value from cookie
	    		 obj.println("<b>Password: </b>"+c.getValue());
	    	}
	    }
	       
	}
}
