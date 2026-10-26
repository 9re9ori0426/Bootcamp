package com.dw._5_model2_bmi;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

public class Model {
    public static void calc(HttpServletRequest req) throws UnsupportedEncodingException {
        req.setCharacterEncoding("utf-8");
        // 1. 값 받기
        String n = req.getParameter("name");
        double h = Double.parseDouble(req.getParameter("height"));
        double w = Double.parseDouble(req.getParameter("weight"));

        if (h > 3) {
            h /= 100;
        }
        double bmi = w / (h * h);
        String bmi2 = String.format("%.1f",bmi);
        String result = "3단계 비만";
        if (bmi < 18.5) {
            result = "저체중";
        } else if (bmi <= 22.9) {
            result = "정상";
        } else if (bmi <= 24.9) {
            result = "비만전단계";
        } else if (bmi <= 29.9) {
            result = "1단계 비만";
        } else if (bmi <= 34.9) {
            result = "2단계 비만";
        }

        Bean bean = new Bean(n, h, w, bmi, result);
        req.setAttribute("bean", bean);
    }
}
