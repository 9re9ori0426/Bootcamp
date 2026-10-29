package com.dw._2_db_web;

import javax.servlet.http.HttpServletRequest;

public class M {
    // 파라미터 값으로 Member 객체를 생성해주는 기능
    public static MemberDTO getMember(HttpServletRequest req) {
        String no = req.getParameter("num");
        String name = req.getParameter("name");
        String age = req.getParameter("age");

        int no2 = 0;
        int age2 = 0;
        if (no != null) {
            no2 = Integer.parseInt(no);
        }
        if (age != null) {
            age2 = Integer.parseInt(age);
        }

        MemberDTO member = new MemberDTO(no2, name, age2);
        member.setNo(no2);
        member.setName(name);
        member.setAge(age2);

        return member;
    }

}
