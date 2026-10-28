package com.bo._9_el.attr;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/attr")
public class AttrC extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        req.getRequestDispatcher("attr/input.html").forward(req, res);
    }
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        AttrModel.getExchange(req);

        req.getRequestDispatcher("attr/output.jsp").forward(req, res);
    }
}