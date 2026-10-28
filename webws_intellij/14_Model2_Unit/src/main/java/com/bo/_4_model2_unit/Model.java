package com.bo._4_model2_unit;

import javax.servlet.http.HttpServletRequest;

public class Model {

    public static void calc(HttpServletRequest req) {

        String type = req.getParameter("convert_type");
        double value = Double.parseDouble( req.getParameter("convert_value") );
        String start_unit = null;
        String ret_unit = null;

        String font_color = "";
        String back_color = "";

        double ret = 0;
        switch (type){
            case "CtoI" :
                ret = value/2.54;
                start_unit="cm";
                ret_unit = "inch";

                font_color = "tomato";
                back_color = "violet_back";
                break;
            case "MtoP" :
                ret = value*0.3025;
                start_unit="㎡";
                ret_unit = "평";

                font_color = "green";
                back_color = "green_back";
                break;
            case "CtoF" :
                ret = (value*1.8 ) +32;
                start_unit="℃";
                ret_unit = "℉";

                font_color = "yellow";
                back_color = "yellow_back";
                break;
            case "KtoM" :
                ret = value*0.621371;
                start_unit="km/h";
                ret_unit = "mi/h";

                font_color = "pink";
                back_color = "red_back";
                break;
        }

        Bean b = new Bean(String.format("%.1f", value), String.format("%.1f", ret), start_unit, ret_unit, font_color, back_color);

        req.setAttribute("bean", b);
    }
}
