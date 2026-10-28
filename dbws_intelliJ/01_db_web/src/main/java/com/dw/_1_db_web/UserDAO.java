package com.dw._1_db_web;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    public static void showAllPeople(HttpServletRequest request) {
        // 1. db -> 껍데기 (interface) 3종  con, pstmt, rs

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = DBManager.connect();
            System.out.println("Connected to the database");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBManager.close(con, pstmt, rs);
        }
    }
}
