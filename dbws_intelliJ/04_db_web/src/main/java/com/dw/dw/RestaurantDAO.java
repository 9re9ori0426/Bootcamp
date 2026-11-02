package com.dw.dw;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class RestaurantDAO {
    public static void showAllRes(HttpServletRequest request) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select * from restaurant_test";

        try {
            con = DBManager.connect();
            System.out.println("Connected to the database");
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            RestaurantDTO restaurant = null;
            ArrayList<RestaurantDTO> restaurants = new ArrayList<RestaurantDTO>();

            while (rs.next()) {
                int no = rs.getInt("r_no");
                String name = rs.getString("r_name");
                String place = rs.getString("r_place");
                String img = rs.getString("r_img");
                restaurant = new RestaurantDTO(no, name, place, img);
                restaurants.add(restaurant);
            }

            request.setAttribute("restaurants", restaurants);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBManager.close(con, ps, rs);
        }
    }

    public static void addRes(HttpServletRequest request) {
        // 값 받기 or db

        // upload -> cos.jar

        // 1. 서버상 경로.   2. 로컬 경로
        String savePath = request.getServletContext().getRealPath("upload");
        System.out.println(savePath);

        Connection con = null;
        PreparedStatement ps = null;

        String sql = "insert into restaurant_test values(restaurant_test_seq.nextval, ?, ?, ?)";

        try {
            con = DBManager.connect();
            ps = con.prepareStatement(sql);

            // mr 객체만 생성하면 upload 기능처리 끝. 5개
            MultipartRequest mr = new MultipartRequest(request, savePath, 1024 * 1024 * 20,
                    "utf-8", new DefaultFileRenamePolicy());

            String name = mr.getParameter("name");
            String place = mr.getParameter("place");
            String img = mr.getFilesystemName("img");    // 서버상에 파일명
            System.out.println(name);
            System.out.println(place);
            System.out.println(img);

            ps.setString(1, name);
            ps.setString(2, place);
            ps.setString(3, img);

            if (ps.executeUpdate() > 0) {
                System.out.println("added successfully");
                request.setAttribute("msg", "add success");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBManager.close(con, ps, null);
        }


    }

    public static void delRes(HttpServletRequest request) {
        Connection con = null;
        PreparedStatement ps = null;

        String sql = "delete from RESTAURANT_TEST where r_no = ?";

        try {
            con = DBManager.connect();
            ps = con.prepareStatement(sql);

            ps.setInt(1, Integer.parseInt(request.getParameter("no")));

            if (ps.executeUpdate() > 0) {
                System.out.println("deleted successfully");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBManager.close(con, ps, null);
        }
    }

    public static void upRes(HttpServletRequest request) {
        Connection con = null;
        PreparedStatement ps = null;

        String sql = "update restaurant_test set r_name = ? where r_no = ?";

        try {
            con = DBManager.connect();
            ps = con.prepareStatement(sql);

            ps.setString(1, request.getParameter("name"));
            ps.setInt(2, Integer.parseInt(request.getParameter("no")));

            if (ps.executeUpdate() > 0) {
                System.out.println("updated successfully");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            DBManager.close(con, ps, null);
        }
    }
}
