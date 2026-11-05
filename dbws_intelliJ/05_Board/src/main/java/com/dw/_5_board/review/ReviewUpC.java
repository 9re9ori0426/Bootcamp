package com.dw._5_board.review;

import com.dw._5_board.account.AccountDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/review-update")
public class ReviewUpC extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        ReviewDAO.selectReview(request);
        ReviewDAO2.RDAO.selectReview(request);
        AccountDAO.ADAO.loginCheck(request);
        request.setAttribute("content", "jsp/review/review-update.jsp");
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
//        ReviewDAO.upReview(request);
        ReviewDAO2.RDAO.upReview(request);

        response.sendRedirect("review-detail?no=" + request.getParameter("no"));

    }
}