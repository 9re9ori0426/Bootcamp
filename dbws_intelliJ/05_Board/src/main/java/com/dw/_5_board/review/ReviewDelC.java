package com.dw._5_board.review;

import com.dw._5_board.account.AccountDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/review-delete")
public class ReviewDelC extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        ReviewDAO.delReview(request);
        ReviewDAO2.RDAO.delReview(request);
        AccountDAO.ADAO.loginCheck(request);
        response.sendRedirect("review");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    }
}