package com.bo._1_jsp_model2;

import javax.servlet.http.HttpServletRequest;

public class M {

    public static void calc(HttpServletRequest request) {
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));

        int c = a + b;

        request.setAttribute("ccc", c);
    }
}
