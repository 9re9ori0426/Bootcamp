package com.bo._5_2_remind;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;

public class Model {

    static final int NOW_YEAR = LocalDate.now().getYear();

    public static void calc(HttpServletRequest req) {
        int birth = Integer.parseInt(req.getParameter("birth"));

        int old = NOW_YEAR - birth + 1;

        String msg = "안녕하십니까!!!!!!!!!!!!";
        if( old < 20 ){
            msg = "안녕";
        }


        Bean b = new Bean(birth, old, msg);

        req.setAttribute("bean", b);
    }
}
