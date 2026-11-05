package com.dw._5_board.movie;

import com.dw._5_board.account.AccountDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/movie")
public class MovieC extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (request.getParameterNames().hasMoreElements()) {
            // 삭제하는 일
            MovieDAO.delMovie(request);
        }

        String p = request.getParameter("p");
        int page = 1;
        if (p != null) {
            page = Integer.parseInt(p);
        }

        // 전체 조회하는 일
        MovieDAO.selectAllMovie(request);
        MovieDAO.paging(page, request);
        AccountDAO.ADAO.loginCheck(request);
        request.setAttribute("content", "jsp/movie/movie.jsp");
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 등록하는 일
        MovieDAO.addMovie(request);

        // 어디로?
        response.sendRedirect("movie");
    }
}