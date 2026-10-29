package com.dw.dw;

import java.sql.*;

public class DBManager {
    public static Connection connect() throws SQLException {
        String url = "jdbc:oracle:thin:@192.168.1.122:1521:XE";

        return DriverManager.getConnection(url, "c##dw1004", "dw1004");
    }

    public static void close(Connection con, PreparedStatement ps, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            ps.close();
            con.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
