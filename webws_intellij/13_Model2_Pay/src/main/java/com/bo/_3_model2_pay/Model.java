package com.bo._3_model2_pay;

import javax.servlet.http.HttpServletRequest;

public class Model {
    public static void work(HttpServletRequest req) {
        int earn =  Integer.parseInt(req.getParameter("earn"));
        int spend =  Integer.parseInt(req.getParameter("spend"));

        System.out.println("earn:"+earn);
        System.out.println("spend:"+spend);

        int remain =  earn - spend;
        Result r = new Result(earn, spend, remain);

        req.setAttribute("rr", r);
    }
}
