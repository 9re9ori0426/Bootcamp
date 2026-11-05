package com.dw._5_board.account;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user-login")
public class AccountC extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // 로그아웃하는 일
        AccountDAO.ADAO.logout(request);

        // 어디로?
        response.sendRedirect("main");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // 로그인 하는 일
        AccountDAO.ADAO.login(request);
        AccountDAO.ADAO.loginCheck(request);
//        request.setAttribute("loginPage", "jsp/account/loginOK.jsp");
        request.setAttribute("content", "home.jsp");

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}