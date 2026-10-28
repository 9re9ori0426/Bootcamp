package com.bo._1_tag;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/home")
public class HC extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        req.setAttribute("contentPage", "home.jsp");
        req.getRequestDispatcher("main.jsp").forward(req,res);
    }
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

    }
}