package com.dw._5_board.review;

import com.dw._5_board.account.AccountDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/review-add")
public class ReviewAddC extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        ReviewDAO.addReview(request);
        ReviewDAO2.RDAO.addReview(request);

        AccountDAO.ADAO.loginCheck(request);
        request.setAttribute("content", "jsp/review/review-add.jsp");
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ReviewDAO.addReview(request);

        response.sendRedirect("review");
    }
}