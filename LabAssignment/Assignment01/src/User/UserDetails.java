package User;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserDetails extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		int age = Integer.parseInt(req.getParameter("age"));
		String gender = req.getParameter("gender");
		String birthdate = req.getParameter("dob");
		String address = req.getParameter("address");
		
		int percent1 = Integer.parseInt(req.getParameter("percent1"));
		int percent2 = Integer.parseInt(req.getParameter("percent2"));
		int percent3 = Integer.parseInt(req.getParameter("percent3"));
		
		String company = req.getParameter("company");
		String post = req.getParameter("position");
		int year = Integer.parseInt(req.getParameter("year"));
		
		PrintWriter obj = res.getWriter();
		
		obj.println("\n--------------- Personal Details --------------\n");
		
		obj.println("Name : " + fname + " " + lname);
		obj.println("Age : "+ age);
		obj.println("Gender : " + gender);
		obj.println("DOB : " + birthdate);
		obj.println("Address : " + address);
		
		obj.println("\n--------------- Academic Details ---------------\n");
		obj.println("Graduation : " + percent1);
		obj.println("Intermediate : " + percent2);
		obj.println("HighSchool : " + percent3);
		
		obj.println("\n-------------- Experience Details --------------\n");
		obj.println("Company : " + company);
		obj.println("Position : " + post);
		obj.println("Experience : " + year);
		
	}
}