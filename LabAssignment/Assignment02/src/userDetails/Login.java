package userDetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter obj = res.getWriter();
		
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		
		if(name.equals("admin") && pass.equals("admin1234"))
		{
			obj.println("You are successfully logged in !!!!!");
			//Creating two cookies
	        Cookie c1=new Cookie("userName",name);
	        Cookie c2=new Cookie("userPassword",pass);

	        //Adding the cookies to response header
	        res.addCookie(c1);
	        res.addCookie(c2);
	        
	        res.sendRedirect("welcome");
		}
		
		else
		{
			obj.println("Invalid username or password !!!!");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req,res);
		}
	}
}
