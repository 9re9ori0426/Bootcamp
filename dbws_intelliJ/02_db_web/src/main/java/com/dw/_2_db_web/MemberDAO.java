package com.dw._2_db_web;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO {
    public static ArrayList<MemberDTO> getAllMember() {
        // 1. 값받기 db세팅
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "select * from MEMBER_TEST";

        try {
            conn = DBManager.connect();
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            MemberDTO member = null;
            ArrayList<MemberDTO> members = new ArrayList<>();

            while (rs.next()) {
                int no = rs.getInt("m_no");
                String name = rs.getString("m_name");
                int age = rs.getInt("m_age");
                member = new MemberDTO(no, name, age);
                members.add(member);
            }

            return members;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBManager.close(conn, pstmt, rs);
        }

        return null;
    }

    public static void addMember(MemberDTO member) {
        // 1. 값, db
        Connection conn = null;
        PreparedStatement pstmt = null;

        String sql = "insert into MEMBER_TEST values (MEMBER_TEST_SEQ.nextval, ?, ?)";

        try {
            conn = DBManager.connect();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, member.getName());
            pstmt.setInt(2, member.getAge());

            if (pstmt.executeUpdate() > 0) {
                System.out.println("added successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBManager.close(conn, pstmt, null);
        }
    }

    public static void deleteMember(MemberDTO member) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        String sql = "delete from MEMBER_TEST where m_no = ?";

        try {
            conn = DBManager.connect();
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, member.getNo());

            if (pstmt.executeUpdate() > 0) {
                System.out.println("deleted successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBManager.close(conn, pstmt, null);
        }
    }

    public static void updateMember(MemberDTO member) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        String sql = "update MEMBER_TEST set m_name = ? where m_no = ?";

        try {
            conn = DBManager.connect();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, member.getName());
            pstmt.setInt(2, member.getNo());

            if (pstmt.executeUpdate() > 0) {
                System.out.println("updated successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBManager.close(conn, pstmt, null);
        }
    }
}
