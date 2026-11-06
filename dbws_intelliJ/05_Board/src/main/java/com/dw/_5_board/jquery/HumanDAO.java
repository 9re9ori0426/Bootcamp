package com.dw._5_board.jquery;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.simple.JSONObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class HumanDAO {

    public static void test1(HttpServletRequest request) {
        String name = request.getParameter("name");
        String age = request.getParameter("age");

        System.out.println(name);
        System.out.println(age);
    }
    public static void test2(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String str = "hello?!";

        // json -> json-simple, gson
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("string", str);

        response.setContentType("application/json;charset=utf-8");
        response.getWriter().println(jsonObject);
    }
    public static void test3(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HumanVO humanVO = new HumanVO();
        humanVO.setName("dw");
        humanVO.setAge(20);
        System.out.println(humanVO);

        JsonObject jobj = new JsonObject();
        jobj.addProperty("name", humanVO.getName());
        jobj.addProperty("age", humanVO.getAge());

        response.setContentType("application/json;charset=utf-8");
//        response.getWriter().println(jobj);

        // 1. 객체 응답
        System.out.println(humanVO.toJSON());
//        response.getWriter().println(humanVO.toJSON());

        // 2. 객체 키값 실어서 전송
        JsonObject jobj2 = new JsonObject();
        JsonParser parser = new JsonParser();
        jobj2.add("person", parser.parse(humanVO.toJSON()));
        response.getWriter().println(jobj2);
    }
    public static void test4(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HumanVO human1 = new HumanVO(1, "dw1", 10);
        HumanVO human2 = new HumanVO(2, "dw2", 10);
        HumanVO human3 = new HumanVO(3, "dw3", 10);

        System.out.println(human1);
        System.out.println(human1.toJSON());

        ArrayList<String> humans = new ArrayList<>();
        humans.add(human1.toJSON());
        humans.add(human2.toJSON());
        humans.add(human3.toJSON());
        System.out.println(humans);

        response.setContentType("application/json;charset=utf-8");
        response.getWriter().println(humans);
    }
    public static void getHuman() {

    }
}
