package com.bo._1_tag.unit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/unit")
public class UnitC extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        req.setAttribute("contentPage", "unit/unit_input.html");
        req.getRequestDispatcher("main.jsp").forward(req,res);
    }
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        Model.calc(req);

        req.setAttribute("contentPage", "unit/unit_output.jsp");
        req.getRequestDispatcher("main.jsp").forward(req,res);
    }
}