package com.dw._3_model2_pay;

import javax.servlet.http.HttpServletRequest;

public class Model {
    public static void work(HttpServletRequest request) {
        int e = Integer.parseInt(request.getParameter("earn"));
        int s = Integer.parseInt(request.getParameter("spend"));

        int remain = e - s;

        // 결과에서 뭘 쓸지?
            // 뭉쳐서 보내기  (객체)
        Result r = new Result();
        r.setRemain(remain);
        r.setSpend(s);
        r.setEarn(e);
        request.setAttribute("rr", r);
    }
}
