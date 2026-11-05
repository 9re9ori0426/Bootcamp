package com.dw._5_board.movie;

import com.dw._5_board.main.DBManager;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MovieDAO {

    private static ArrayList<MovieVO> movies;

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
            movies = new ArrayList<>();
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
            MovieDAO.paging(1, request);
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
            if (img == null) {
                img = "static-img/fox.jpg";
            } else {
                img = "movieFile/" + img;
            }
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

    public static void delMovie(HttpServletRequest request) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "delete from movie_test where m_no = ?";
        try {
            conn = DBManager.connect();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, request.getParameter("no"));

            if (pstmt.executeUpdate() == 1) {
                System.out.println("deleted successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBManager.close(conn, pstmt, null);
        }
    }

    public static void updateMovie(HttpServletRequest request) {
        // 1. 값 or db
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "update movie_test set m_title = ?, M_ACTOR = ?, M_STORY = ? where m_no = ?";
        String no = request.getParameter("no");
        String title = request.getParameter("title");
        String actor = request.getParameter("actor");
        String story = request.getParameter("story");
        if (story == null) {
            sql = "update movie_test set m_title = ?, M_ACTOR = ? where m_no = ?";
        }

        try {
            request.setCharacterEncoding("utf-8");

            conn = DBManager.connect();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, title);
            pstmt.setString(2, actor);
            if (story != null) {
                pstmt.setString(3, story);
                pstmt.setString(4, no);
            } else {
                pstmt.setString(3, no);
            }

            if (pstmt.executeUpdate() == 1) {
                System.out.println("updated successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBManager.close(conn, pstmt, null);
        }
    }

    public static void editMovie(HttpServletRequest request) {
        // 1. 값 or db
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "update MOVIE_TEST set m_title = ?, M_ACTOR = ?, M_IMG = ?, M_STORY = ? where m_no = ?";

        // 파일 업로드 기능 -> mr 객체
        try {
            String savePath = request.getServletContext().getRealPath("movieFile");
            System.out.println(savePath);
            MultipartRequest mr = new MultipartRequest(request, savePath, 1024 * 1024 * 30,
                    "utf-8", new DefaultFileRenamePolicy());

            String title = mr.getParameter("title");
            String actor = mr.getParameter("actor");
            String oldImg = mr.getParameter("oldImg");
            String newImg = mr.getFilesystemName("newImg");
            String img = "movieFile/" + newImg;
            if (newImg == null) {
                img = oldImg;
            }
            String story = mr.getParameter("story");
            String no = mr.getParameter("no");

            System.out.println(title);
            System.out.println(actor);
            System.out.println(story);
            System.out.println(no);

            conn = DBManager.connect();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, title);
            pstmt.setString(2, actor);
            pstmt.setString(3, img);
            pstmt.setString(4, story);
            pstmt.setString(5, no);
            request.setAttribute("no", no);

            if (pstmt.executeUpdate() == 1) {
                System.out.println("added successfully");
                if (newImg != null) {   // 사진 교체
                    File f = new File(savePath + "/" + oldImg);
                    f.delete();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBManager.close(conn, pstmt, null);
        }
    }

    public static void paging(int pageNum, HttpServletRequest request) {
        request.setAttribute("currentPage", pageNum);

        int total = movies.size();
        int cnt = 3;

        int totalPage = (int) Math.ceil((double) total / cnt);
        request.setAttribute("totalPage", totalPage);

        int start = total - (cnt * (pageNum - 1));
        int end = (pageNum == totalPage) ? -1 : start - (cnt + 1);

        ArrayList<MovieVO> items = new ArrayList<>();
        for (int i = start - 1; i > end; i--) {
            items.add(movies.get(i));
        }

        request.setAttribute("movies", items);
    }
}
