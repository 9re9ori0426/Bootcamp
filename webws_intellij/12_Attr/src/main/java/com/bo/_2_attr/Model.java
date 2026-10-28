package com.bo._2_attr;

import javax.servlet.http.HttpServletRequest;

public class Model {
    public static void getExchange(HttpServletRequest req) {
        int p = Integer.parseInt(req.getParameter("p"));
        int m = Integer.parseInt(req.getParameter("m"));

        int ex = m - p;

        String msg = "잔돈 여기 있습니다~~ ^-^";
        if( ex == 0 ){
            msg = "감사합니다! ^^";
        }
        else if (ex < 0){
            msg = "돈 모자른데요..? -_-??";
        }
//        req.setAttribute("price", p);
//        req.setAttribute("money", m);
//        req.setAttribute("exchange", ex);
//        req.setAttribute("message", msg);

        Result r = new Result(p, m, ex, msg);

        System.out.println(r.toString());

        req.setAttribute("result", r);


    }

    public static void makeValue(HttpServletRequest req) {
        int asd = Integer.parseInt(req.getParameter("asd"));

        req.setAttribute("asdasd", Math.abs(asd) );
    }
}
