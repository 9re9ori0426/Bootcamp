package com.dw._5_board.movie;

import com.dw._5_board.account.AccountDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/edit")
public class MovieEditC extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        AccountDAO.ADAO.loginCheck(request);
        MovieDAO.selectMovie(request);
        request.setAttribute("content", "jsp/movie/movie_edit.jsp");
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // 수정하는 일
        MovieDAO.editMovie(request);

        // 어디로?
        response.sendRedirect("detail?no=" + request.getAttribute("no"));
    }
}