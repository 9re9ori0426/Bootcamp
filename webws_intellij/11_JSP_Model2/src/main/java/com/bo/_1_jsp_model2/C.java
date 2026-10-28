package com.bo._1_jsp_model2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "C", value = "/c")
public class C extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("controller ----");
        response.sendRedirect("v1.html");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        M.calc(request);

        RequestDispatcher rd = request.getRequestDispatcher("v2.jsp");
        rd.forward(request, response);
    }
}