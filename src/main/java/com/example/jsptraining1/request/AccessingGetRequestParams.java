package com.example.jsptraining1.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "accessingGetRequestParams", urlPatterns = "/name")
public class AccessingGetRequestParams extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>Acessing Get Request Parameters</h1>");
        if (firstName == null || lastName == null){
            System.out.println("No full name given");
            out.println("<p>No full name given</p>");
        } else{
            System.out.println("Full Name : "+firstName+" "+lastName);
            out.println("<p>Full Name : "+firstName+" "+lastName+"</p>");
        }
    }
}
