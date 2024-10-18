package com.example.jsptraining1.mapping;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class XMLServlet extends HttpServlet {

    private String message;
    private String methode;

    public void init(){
        message = "Learning how to map Servlet";
        methode = "URL Patterns";
    }

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("XML FILE!");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>Mapping Servlet</h1>");
        out.println("<p>This page's mapping servlet to 'URL Patterns' from a tag.</p>");
        out.println("<footer><p>"+message+"</p>");
        out.println("<p>Go to <a href='servl-map'>"+methode+"</a></p></footer>");
        out.println("</body></html>");
    }
}
