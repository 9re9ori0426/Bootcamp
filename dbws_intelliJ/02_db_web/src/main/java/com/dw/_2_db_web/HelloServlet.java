package com.dw._2_db_web;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/all")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // 전체조회하는 일
        request.setAttribute("members", MemberDAO.getAllMember());
        // 어디로?
        request.getRequestDispatcher("member_list.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        MemberDAO.addMember(M.getMember(request));

//        MemberDAO.getAllMember(request);
//        request.getRequestDispatcher("member_list.jsp").forward(request, response);
        response.sendRedirect("all");
    }
}