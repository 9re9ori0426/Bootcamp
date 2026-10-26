package com.dw._4_model2_unit;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

public class Model {

    public static void calc(HttpServletRequest req) throws UnsupportedEncodingException {
        req.setCharacterEncoding("utf-8");
        // cm * 0.393701
        // m * 0.3025
        // c *1.8 + 32
        // km * 0.621371
        // 1. 값 받기
        double num = Double.parseDouble(req.getParameter("num"));

        String unit = req.getParameter("unit");
        String covertedUnit = null;
        covertedUnit = "mi/h";
        double result = num * 0.621371;
        String cc = "d";
        if (unit.equals("cm")) {
            result = num * 0.393701;
            covertedUnit = "inch";
            cc = "a";
        } else if (unit.equals("㎡")) {
            result = num * 0.3025;
            covertedUnit = "평";
            cc = "b";
        } else if (unit.equals("℃")) {
            result = num * 1.8 + 32;
            covertedUnit = "℉";
            cc = "c";
        }

        // 그걸 한데 뭉쳐서 보내자 (객체)
        Bean bean = new Bean(cc, num, unit, result, covertedUnit);
        req.setAttribute("bean", bean);
    }
}
