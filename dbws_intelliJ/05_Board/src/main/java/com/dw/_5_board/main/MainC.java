package com.dw._5_board.main;

import com.dw._5_board.account.AccountDAO;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/main")
public class MainC extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        request.setAttribute("loginPage", "jsp/account/login.jsp");
        AccountDAO.ADAO.loginCheck(request);
        request.setAttribute("content", "home.jsp");

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }
}