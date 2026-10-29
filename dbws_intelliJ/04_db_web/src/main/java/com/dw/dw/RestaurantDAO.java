package com.dw.dw;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class RestaurantDAO {
    public static void getAllRestaurant(HttpServletRequest request) {
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
}
