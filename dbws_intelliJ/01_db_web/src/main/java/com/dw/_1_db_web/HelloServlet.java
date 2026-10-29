package com.dw._1_db_web;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/show-all")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // 전체 조회하는 일
        UserDAO.showAllPeople(request);

        // 어디로?
        request.getRequestDispatcher("output.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 등록하는 일
        UserDAO.addPerson(req);

        // 어디로?
        UserDAO.showAllPeople(req);
        req.getRequestDispatcher("output.jsp").forward(req, resp);
    }
}