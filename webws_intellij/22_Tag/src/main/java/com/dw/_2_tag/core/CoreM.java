package com.dw._2_tag.core;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.util.ArrayList;

public class CoreM {
    public static void work(HttpServletRequest req) {
        int year = Integer.parseInt(req.getParameter("year"));
        System.out.println(year);

        int curYear = LocalDate.now().getYear();
        int age = curYear - year + 1;
        req.setAttribute("age", age);

        int[] ar = {1,2,3,4,5};
        req.setAttribute("ar", ar);

        ArrayList<Menu> menusss = new ArrayList();
        menusss.add(new Menu("콩나물국밥", 10000));
        menusss.add(new Menu("햄버거", 8000));
        menusss.add(new Menu("타코", 7900));
        menusss.add(new Menu("김치찌개", 12000));
        req.setAttribute("menus", menusss);
    }
}
