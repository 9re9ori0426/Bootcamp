package com.dw._5_board.movie;

import com.dw._5_board.main.DBManager;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MovieDAO {
    // 전체조회
    public static void selectAllMovie(HttpServletRequest request) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "select * from movie_test";
        try {
            conn = DBManager.connect();
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            ArrayList<MovieVO> movies = new ArrayList<>();
            MovieVO movie = null;
            while (rs.next()) {
                int no = rs.getInt("m_no");
                String title = rs.getString("m_title");
                String actor = rs.getString("m_actor");
                String img = rs.getString("m_img");
                String story = rs.getString("m_story");
                movie = new MovieVO(no, title, actor, img, story);
                movies.add(movie);
            }
            request.setAttribute("movies", movies);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBManager.close(conn, pstmt, rs);
        }
    }

    public static void addMovie(HttpServletRequest request) {
        // 1. 값 or db
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "insert into movie_test values(MOVIE_TEST_SEQ.nextval, ?, ?, ?, ?)";

        // 파일 업로드 기능 -> mr 객체
        String savePath = request.getServletContext().getRealPath("movieFile");
        System.out.println(savePath);
        try {
            MultipartRequest mr = new MultipartRequest(request, savePath, 1024 * 1024 * 30,
                    "utf-8", new DefaultFileRenamePolicy());

            String title = mr.getParameter("title");
            String actor = mr.getParameter("actor");
            String img = mr.getFilesystemName("img");
            String story = mr.getParameter("story");

            System.out.println(title);
            System.out.println(actor);
            System.out.println(img);
            System.out.println(story);

            conn = DBManager.connect();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, title);
            pstmt.setString(2, actor);
            pstmt.setString(3, img);
            pstmt.setString(4, story);

            if (pstmt.executeUpdate() == 1) {
                System.out.println("added successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBManager.close(conn, pstmt, null);
        }
    }

    public static void selectMovie(HttpServletRequest request) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "select * from movie_test where m_no = ?";
        try {
            conn = DBManager.connect();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, request.getParameter("no"));
            rs = pstmt.executeQuery();
            MovieVO movie = null;
            if (rs.next()) {
                int no = rs.getInt("m_no");
                String title = rs.getString("m_title");
                String actor = rs.getString("m_actor");
                String img = rs.getString("m_img");
                String story = rs.getString("m_story");
                movie = new MovieVO(no, title, actor, img, story);
            }
            request.setAttribute("movie", movie);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBManager.close(conn, pstmt, rs);
        }
    }
}
