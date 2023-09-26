package com.example.jakartaeetest;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import utils.*;
@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    private Repository rep_1;

    public void init() {
        message = "Hello World!";
        Person p1 = new Person(1, "Alice", "Johnson", 3.8);
        Person p2 = new Person(2, "Bob", "Smith", 3.5);
        Person p3 = new Person(3, "Charlie", "Brown", 3.2);
        Person p4 = new Person(4, "David", "Davis", 3.9);
        rep_1 = new Repository("INT207");
        rep_1.add(p1);
        rep_1.add(p2);
        rep_1.add(p3);
        rep_1.add(p4);


    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html");
        request.setAttribute("result",rep_1);
        request.getRequestDispatcher("/test.jsp").forward(request,response);

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}