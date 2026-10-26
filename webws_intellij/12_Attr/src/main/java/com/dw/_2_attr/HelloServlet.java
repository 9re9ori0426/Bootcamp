package com.dw._2_attr;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/hc")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
            // 첫번쨰 페이지를 보여주기
//        response.sendRedirect("index.html");
        request.getRequestDispatcher("input.html").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            // 값 받기 -> 계산 (Model)
        Model.getExchange(req);

        // 어디로?
        req.getRequestDispatcher("output2.jsp").forward(req, resp);
    }
}