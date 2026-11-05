package com.dw._5_board.review;

import com.dw._5_board.account.AccountDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/review")
public class ReviewC extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        ReviewDAO.selectAllReview(request);
        ReviewDAO2.RDAO.selectAllReview(request);

        String p = request.getParameter("p");
        int page = 1;
        if (p != null) {
            page = Integer.parseInt(p);
        }

        ReviewDAO2.RDAO.pageReview(page, request);
//        ReviewDAO.pageReview(page, request);
//        request.setAttribute("main-row", "jsp/review/review-row.jsp");
        AccountDAO.ADAO.loginCheck(request);
        request.setAttribute("content", "jsp/review/review.jsp");
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    }
}