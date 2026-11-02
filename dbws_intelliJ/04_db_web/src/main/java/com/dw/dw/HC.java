package com.dw.dw;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/home")
public class HC extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // 전체 조회하는 일
        RestaurantDAO.showAllRes(request);

        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // 레스토랑 추가하는 일
        RestaurantDAO.addRes(request);

        // 어디로?
//        RestaurantDAO.showAllRes(request);
//        request.getRequestDispatcher("index.jsp").forward(request, response);
        response.sendRedirect("home?status=success");
    }
}