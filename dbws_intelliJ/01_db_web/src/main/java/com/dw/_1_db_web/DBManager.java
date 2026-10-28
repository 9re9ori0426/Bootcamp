package com.dw._1_db_web;

import java.sql.*;

public class DBManager {
    public static Connection connect() throws SQLException {
        String url = "jdbc:oracle:thin:@192.168.1.122:1521:XE";
        String url2 = "jdbc:oracle:thin:@wv5rrwf09uxz5jjb_medium?TNS_ADMIN=C:\\dw\\Wallet_WV5RRWF09UXZ5JJB";

//                                                    DW                   Soldesk502!!
        return DriverManager.getConnection(url, "c##dw1004", "dw1004");
    }

    public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
