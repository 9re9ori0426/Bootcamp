package com.dw._5_board.review;

import com.dw._5_board.main.DBManager;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class ReviewDAO {

    public static ArrayList<ReviewDTO> reviews = new ArrayList<ReviewDTO>();

    public static void selectAllReview(HttpServletRequest request) {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "select * from review_test";

        try {
            con = DBManager.connect();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            reviews = new ArrayList<>();
            ReviewDTO review = null;
            while (rs.next()) {
                int no  = rs.getInt("r_no");
                String title = rs.getString("r_title");
                String txt = rs.getString("r_txt");
                Date date = rs.getDate("r_date");
                review = new ReviewDTO(no, title, txt, date);
                reviews.add(review);


            }

//            request.setAttribute("reviews", reviews);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBManager.close(con,pst,rs);
        }


    }

    public static void addReview(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        Connection con = null;
        PreparedStatement pst = null;
        String sql = "insert into REVIEW_TEST values (REVIEW_TEST_SEQ.nextval, ?,?,sysdate)";

        try {
            con = DBManager.connect();
            pst = con.prepareStatement(sql);
            String title = request.getParameter("title");
            String txt = request.getParameter("text");

            pst.setString(1, title);
            pst.setString(2, txt);

            if (pst.executeUpdate() == 1) {
                System.out.println("added successfully");
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBManager.close(con,pst,null);
        }


    }

    public static void selectReview(HttpServletRequest request) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "select * from review_test where r_no=?";

        try {
            con = DBManager.connect();
            pst = con.prepareStatement(sql);
            pst.setString(1, request.getParameter("no"));
            rs = pst.executeQuery();
            ReviewDTO review = null;
            while (rs.next()) {
                int no  = rs.getInt("r_no");
                String title = rs.getString("r_title");
                String txt = rs.getString("r_txt");
                Date date = rs.getDate("r_date");
                review = new ReviewDTO(no, title, txt, date);


            }

            request.setAttribute("review", review);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBManager.close(con,pst,rs);
        }
    }

    public static void delReview(HttpServletRequest request) {
        Connection con = null;
        PreparedStatement pst = null;
        String sql = "delete REVIEW_TEST where r_no=?";

        try {
            con = DBManager.connect();
            pst = con.prepareStatement(sql);
            pst.setString(1, request.getParameter("no"));

            if (pst.executeUpdate() == 1) {
                System.out.println("delete successfully");
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBManager.close(con,pst,null);
        }
    }

    public static void upReview(HttpServletRequest request) {
        Connection con = null;
        PreparedStatement pst = null;
        String sql = "update REVIEW_TEST set r_title=?, r_txt=?,r_date=sysdate where r_no=?";

        try {
            con = DBManager.connect();
            pst = con.prepareStatement(sql);
            pst.setString(1, request.getParameter("title"));
            pst.setString(2, request.getParameter("text"));
            pst.setString(3, request.getParameter("no"));


            if (pst.executeUpdate() == 1) {
                System.out.println("update successfully");
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBManager.close(con,pst,null);
        }
    }

    public static void pageReview(int pageNum, HttpServletRequest request) {
        request.setAttribute("currentPage", pageNum);
        int total = reviews.size();
        int count = 5;

        int totalPage = (int) Math.ceil((double)total / count);
        request.setAttribute("totalPage", totalPage);

        int start = total - (count * (pageNum - 1));
        int end = (pageNum == totalPage) ? -1 : start - (count + 1);

        ArrayList<ReviewDTO> items = new ArrayList<>();
        for (int i = start -1; i > end; i--) {
            items.add(reviews.get(i));
        }

        request.setAttribute("reviews", items);

    }

}
