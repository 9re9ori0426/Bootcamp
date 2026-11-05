package com.dw._5_board.movie;

import com.dw._5_board.account.AccountDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/update")
public class MovieUpC extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String title = request.getParameter("title");
        if (title != null) {
            MovieDAO.updateMovie(request);
            response.sendRedirect("movie");
        } else {
            // 그 영화 하나 조회
            AccountDAO.ADAO.loginCheck(request);
            MovieDAO.selectMovie(request);
            request.setAttribute("content", "jsp/movie/movie_up.jsp");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // 수정하는 일
        MovieDAO.updateMovie(request);
        // 어디로?
        response.sendRedirect("detail?no=" + request.getParameter("no"));
    }
}