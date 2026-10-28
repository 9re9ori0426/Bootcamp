package com.bo._1_tag.bmi;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/bmi")
public class BMIC extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        req.setAttribute("contentPage", "bmi/bmi_input.html");
        req.getRequestDispatcher("main.jsp").forward(req,res);
    }
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        req.setCharacterEncoding("UTF-8");

        BmiModel.calc(req);

        req.setAttribute("contentPage", "bmi/bmi_output.jsp");
        req.getRequestDispatcher("main.jsp").forward(req,res);
    }
}