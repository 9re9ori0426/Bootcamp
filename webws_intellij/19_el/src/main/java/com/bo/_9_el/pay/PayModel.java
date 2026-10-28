package com.bo._9_el.pay;

import javax.servlet.http.HttpServletRequest;

public class PayModel {
    public static void work(HttpServletRequest req) {
        int earn =  Integer.parseInt(req.getParameter("earn"));
        int spend =  Integer.parseInt(req.getParameter("spend"));

        int remain =  earn - spend;
        Result r = new Result(earn, spend, remain);

        req.setAttribute("rr", r);
    }
}
