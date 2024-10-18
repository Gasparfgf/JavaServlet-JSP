package com.example.jsptraining1;

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

    public void init(){
        message = "Learning how to map Servlet";
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("CALLED OUT!");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>Mapping Servlet</h1>");
        out.println("<p>This page's mapping servlet to 'URL Patterns' from a tag.</p>");
        out.println("<footer>"+message+"</footer>");
        out.println("</body></html>");
    }
}
