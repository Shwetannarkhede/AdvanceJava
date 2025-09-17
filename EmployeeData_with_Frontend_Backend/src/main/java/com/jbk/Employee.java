package com.jbk;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class Employee extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

       
        int empid1 = Integer.parseInt(request.getParameter("empid"));
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");   
        String email = request.getParameter("email");
        long phoneNo = Long.parseLong(request.getParameter("phone"));
        int age1 = Integer.parseInt(request.getParameter("age"));
        String gender = request.getParameter("gender"); 
        String department = request.getParameter("department");
        int salary1 = Integer.parseInt(request.getParameter("salary"));
        String experience = request.getParameter("experience");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String country = request.getParameter("country");

//        System.out.println(empid1);
//        System.out.println(fname);
//        System.out.println(lname);
//        System.out.println(email);
//        System.out.println(phoneNo);
//        System.out.println(age1);
//        System.out.println(gender);
//        System.out.println(department);
//        System.out.println(salary1);
//        System.out.println(experience);
//        System.out.println(address);
//        System.out.println(city);
//        System.out.println(state);
//        System.out.println(country);

       
        PrintWriter out = response.getWriter();
//        out.println("<h2>Employee Registration</h2>");
//        out.println("<h3>Employee ID: " + empid1 + "</h3>");
//        out.println("<h3>First Name: " + fname + "</h3>");
//        out.println("<h3>Last Name: " + lname + "</h3>");
//        out.println("<h3>Email: " + email + "</h3>");
//        out.println("<h3>Mobile: " + phoneNo + "</h3>");
//        out.println("<h3>Age: " + age1 + "</h3>");
//        out.println("<h3>Gender: " + gender + "</h3>");
//        out.println("<h3>Department: " + department + "</h3>");
//        out.println("<h3>Salary: " + salary1 + "</h3>");
//        out.println("<h3>Experience: " + experience + "</h3>");
//        out.println("<h3>Address: " + address + "</h3>");
//        out.println("<h3>City: " + city + "</h3>");
//        out.println("<h3>State: " + state + "</h3>");
//        out.println("<h3>Country: " + country + "</h3>");

        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:8000/empregistration", "root", "Shweta@123");

            
            PreparedStatement ps = c.prepareStatement(
                    "INSERT INTO employee (empId, fname, lname, email, mobile, age, gender, department, salary, experience, address, city, state, country) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            ps.setInt(1, empid1);
            ps.setString(2, fname);
            ps.setString(3, lname);
            ps.setString(4, email);
            ps.setLong(5, phoneNo);
            ps.setInt(6, age1);
            ps.setString(7, gender);
            ps.setString(8, department);
            ps.setInt(9, salary1);
            ps.setString(10, experience);
            ps.setString(11, address);
            ps.setString(12, city);
            ps.setString(13, state);
            ps.setString(14, country);

            int check = ps.executeUpdate();

            if (check > 0) {
                out.println("<h1 style='color:green'>"+"Data is inserted..."+ "</h1>");
            } else {
                out.println("<h1 style='color:red'>"+"Data is  Not inserted..."+ "</h1>");
            }

            c.close();

        } catch (Exception e) {
            out.println("<h2 style='color:red'>Error: " + e.getMessage() + "</h2>");
        }
    }
}
