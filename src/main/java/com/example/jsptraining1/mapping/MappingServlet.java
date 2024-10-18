package com.example.jsptraining1.mapping;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "mappingServlet", urlPatterns = "/servl-map")
public class MappingServlet extends HttpServlet {

    private String message;
    private String methode;

    public void init(){
        message = "Learning how to map Servlet";
        methode = "XML Servlets";
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("URL PATTERNS!");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>Mapping Servlet</h1>");
        out.println("<p>This page's mapping servlet to 'URL Patterns' from a tag.</p>");
        out.println("<footer><p>"+message+"</p>");
        out.println("<p>Go to <a href= 'servl-xml'>"+methode+"</a></p></footer>");
        out.println("</body></html>");
    }
}
