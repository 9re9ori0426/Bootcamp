package com.dw._5_board;

import com.dw._5_board.account.AccountDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/menu4")
public class Menu4C extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        AccountDAO.ADAO.loginCheck(request);
        request.setAttribute("content", "jsp/menu4/menu4.jsp");
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

}