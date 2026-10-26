package com.dw.demo1;

import javax.servlet.http.HttpServletRequest;

public class Model {
    public static void getAge(HttpServletRequest req) {
        int birth = Integer.parseInt(req.getParameter("birth"));
        int age = 2026 - birth + 1;
        String msg = null;
        if (age < 20) {
            msg = "안녕";
        }
        else {
            msg = "안녕하세요";
        }

        // 값을 한데 뭉처서 (객체)
        AAA aaa = new AAA();
        aaa.setAge(age);
        aaa.setBirth(birth);
        aaa.setMsg(msg);

        req.setAttribute("a", aaa);
    }
}
