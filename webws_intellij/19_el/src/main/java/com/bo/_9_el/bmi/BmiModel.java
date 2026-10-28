package com.bo._9_el.bmi;

import javax.servlet.http.HttpServletRequest;

public class BmiModel {
    public static void calc(HttpServletRequest req) {
        // 1. 필요한 값 키, 체중, 이름
        String name = req.getParameter("name");
        double height = Double.parseDouble(req.getParameter("height") );
        double weight = Double.parseDouble(req.getParameter("weight") );
        // 2. 계산식
        // 체중 / 키 x 키 (m)
        if (height > 3) {
            height /= 100;
        }
        double bmi = weight / (height * height);

        // 저 체 중 18.5미만
        // 정 상 18.5이상 ~ 22.9이하
        // 비만전단계 23이상 ~ 24.9이하
        // 1단계 비만 25이상 ~ 29.9이하
        // 2단계 비만 30이상 ~ 34.9이하
        // 3단계 비만 35이상
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
        // 4. 결과출력 (소수점 1~2자리까지만)

        // BMI 지수 : ㅇㅇ
        // oo님, 당신은 oo 입니다.
        String bmi_msg = String.format("BMI지수 : %.2f\n", bmi);
        String result_msg = String.format(name + "님, 당신은 " + result + " 입니다.");

        Bean b = new Bean(name, height, weight, bmi_msg, result_msg);

        req.setAttribute("bean", b);
    }
}
