import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

class Coffee {
    public String name;
    public int price;
    public String origin;

    public Coffee(String name, int price, String origin) {
        this.name = name;
        this.price = price;
        this.origin = origin;
    }
}

public class CoffeeDB {
    public static Map<Integer, Coffee> printAll(Connection conn) throws SQLException {
        String query = "SELECT * FROM COFFEE_TEST";

        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        Map<Integer, Coffee> m =  new HashMap();
        while(rs.next()) {
            int _no =  rs.getInt(1);
            String _name =  rs.getString(2);
            int _price =  rs.getInt(3);
            String _origin =  rs.getString(4);

            System.out.println(_no + "]\t" + _name + "\t" + _price + "\t" + _origin);
            m.put(_no, new Coffee(_name, _price, _origin));
        }

        return m;
    }
}
