package com.dw._5_board.movie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delmovie")
public class MovieDelC extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        MovieDAO.delMovie(request);

        MovieDAO.MDAO.delMovie(request);
        response.sendRedirect("movie");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // 등록하는 일
//        MovieDAO.addMovie(request);

        MovieDAO.MDAO.addMovie(request);
        response.sendRedirect("movie");
    }
}