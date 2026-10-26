package com.dw._2_attr;

import javax.servlet.http.HttpServletRequest;

public class Model {
    public static void getExchange(HttpServletRequest req) {
        // 1. 값 받기
        int price = Integer.parseInt(req.getParameter("p"));
        int money = Integer.parseInt(req.getParameter("m"));

        int exchange = money - price;

        String say = "잔돈 여기 있습니다~";
        if (price == money) {
            say = "감사합니다!";
        } else if (price > money) {
            say = "돈 모자른데요...";
        }

        // 결과페이지 뭘 쓸지?
        // price, money, ex, say
        req.setAttribute("price", price);
        req.setAttribute("money", money);
        req.setAttribute("exchange", exchange);
        req.setAttribute("say", say);


        // 위에처럼 필요한 것들을 따로 실어서 보내도 되는데,
        // 그걸 한데 뭉쳐서 보내자 (객체)

        Result r = new Result(price, money, exchange, say);
        req.setAttribute("result", r);

    }

    public static void makeValue(HttpServletRequest req) {
        int asdf = Integer.parseInt(req.getParameter("asdf"));
        asdf *= -1;
        req.setAttribute("asdfasdf", asdf);
    }
}
