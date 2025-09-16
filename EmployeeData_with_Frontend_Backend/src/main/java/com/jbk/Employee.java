package com.jbk;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submit")

public class Employee extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String empid = request.getParameter("empid");
		int empid1 = Integer.parseInt(empid);
		
		String fname = request.getParameter("fname");
		
		String lname = request.getParameter("lname1");
		
		String email = request.getParameter("email");
		
		String phone = request.getParameter("phone");
		long phoneNo = Long.parseLong(phone);
//		
//		String dob = request.getParameter("dob");
//		int dob1 = Integer.parseInt(dob);
//		
		String age = request.getParameter("age");
		int age1 = Integer.parseInt(age);
		
		String gender = request.getParameter("gender");
		boolean gender1 = Boolean.parseBoolean(gender);
		
		String department = request.getParameter("department");
		
		String salary = request.getParameter("salary");
		int salary1 = Integer.parseInt(salary);
		
		String experience = request.getParameter("experience");
		
		String address = request.getParameter("address");
		
		String city = request.getParameter("city");
		
		String state = request.getParameter("state");
		
		String country = request.getParameter("country");
	
	
		System.out.println(empid1);
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(email);
		System.out.println(phoneNo);
	//	System.out.println(dob1);
		System.out.println(age1);
		System.out.println(gender1);
		System.out.println(department);
		System.out.println(salary1);
		System.out.println(experience);
		System.out.println(address);
		System.out.println(city);
		System.out.println(state);
		System.out.println(country);

		
	}
	}


