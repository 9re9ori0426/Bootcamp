package com.dw._5_board.account;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user-edit")
public class AccountEditC extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // 어디로?
        if (AccountDAO.ADAO.loginCheck(request)) {
            request.setAttribute("content", "jsp/account/edit.jsp");
        } else {
            request.setAttribute("content", "home");
        }
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // 수정하는 일
        if (AccountDAO.ADAO.loginCheck(request)) {
            AccountDAO.ADAO.editUser(request);
        }
        response.sendRedirect("user-info");
    }
}