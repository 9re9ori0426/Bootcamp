package com.dw._1_db_web;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO {
    public static void showAllPeople(HttpServletRequest request) {
        // 1. db -> 껍데기 (interface) 3종  con, pstmt, rs

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "select * from NAME_AGE_TEST";

        try {
            con = DBManager.connect();
            System.out.println("Connected to the database");
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            ArrayList<Human> humans = new ArrayList<>();
            Human h = null;

            // 객체
            while (rs.next()) {
                String name = rs.getString("n_name");
                int age = rs.getInt("n_age");
                System.out.println(name);
                System.out.println(age);
                h = new Human(name, age);
                humans.add(h);
            }

            request.setAttribute("humans", humans);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBManager.close(con, pstmt, rs);
        }
    }

    public static void addPerson(HttpServletRequest req) {
        Connection con = null;
        PreparedStatement pstmt = null;

        String sql = "insert into NAME_AGE_TEST values(?, ?)";

        try {
            req.setCharacterEncoding("utf-8");
            con = DBManager.connect();
            System.out.println("Connected to the database");
            pstmt = con.prepareStatement(sql);

            pstmt.setString(1, req.getParameter("name"));
            pstmt.setString(2, req.getParameter("age"));

            if(pstmt.executeUpdate() > 0) {
                System.out.println("inserted successfully");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBManager.close(con, pstmt, null);
        }
    }
}
