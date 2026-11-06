package com.dw._5_board.account;

import com.dw._5_board.main.DBManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccountDAO {

    public static final AccountDAO ADAO = new AccountDAO();

    private AccountDAO() {

    }

    public boolean loginCheck(HttpServletRequest request) {
        AccountVO user = (AccountVO) request.getSession().getAttribute("user");
        if (user != null) {
            request.setAttribute("loginPage", "jsp/account/loginOK.jsp");
            return true;
        } else {
            request.setAttribute("loginPage", "jsp/account/login.jsp");
            return false;
        }
    }

    public void login(HttpServletRequest request) {
        // 1. 값 or DB
        String id = request.getParameter("id");
        String pw = request.getParameter("pw");

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "select * from LOGIN_TEST where l_id = ?";
        try {
            conn = DBManager.connect();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();
            String msg = null;
            if (rs.next()) {
                if (pw.equals(rs.getString("l_pw"))) {
                    // 로그인 성공
                    // 객체
                    AccountVO accountVO = new AccountVO();
                    accountVO.setId(rs.getString("l_id"));
                    accountVO.setPw(rs.getString("l_pw"));
                    accountVO.setName(rs.getString("l_name"));
//                    request.setAttribute("user", accountVO);
                    request.getSession().setAttribute("user", accountVO);
                    request.getSession().setMaxInactiveInterval(5 * 60);
                    System.out.println("login OK");
                    msg = "로그인 성공";
                } else {
                    // 비번 오류
                    System.out.println("pw error --");
                    msg = "비번 오류";
                }
            } else {
                // 유저 없음
                System.out.println("user not exist");
                msg = "유저 없음";
            }
            request.setAttribute("msg", msg);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBManager.close(conn, pstmt, rs);
        }
    }

    public void logout(HttpServletRequest request) {
        HttpSession hs = request.getSession();

//        hs.invalidate();    // 세션 다 삭제
        hs.setAttribute("user", null);  // user -> null
//        hs.removeAttribute("user");     // user 삭제
    }

    public void editUser(HttpServletRequest request) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        AccountVO user = (AccountVO) request.getSession().getAttribute("user");
        String pw = request.getParameter("pw");
        String name = request.getParameter("name");
        String sql = "update LOGIN_TEST set l_pw = ?, l_name = ? where l_id = ?";
        try {
            conn = DBManager.connect();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, pw);
            pstmt.setString(2, name);
            pstmt.setString(3, user.getId());
            if (pstmt.executeUpdate() == 1) {
                System.out.println("edit success");
                // 로그인 다시
//                login(request);

                // 추천
                user.setName(name);
                user.setPw(pw);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBManager.close(conn, pstmt, null);
        }
    }

    public void deleteUser(HttpServletRequest request) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        AccountVO user = (AccountVO) request.getSession().getAttribute("user");

        // 마지막 입력한 pw가 기존꺼랑 같을때.
        String pw = request.getParameter("pw");

        String sql = "delete from LOGIN_TEST where l_id = ?";
        try {
            conn = DBManager.connect();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user.getId());

            if (pw.equals(user.getPw())) {
                if (pstmt.executeUpdate() == 1) {
                    System.out.println("delete success");
                    logout(request);
                }
            }
            else {
                System.out.println("pw error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBManager.close(conn, pstmt, null);
        }
    }
}
