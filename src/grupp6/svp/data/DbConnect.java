package grupp6.svp.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DbConnect {
    private static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
    private static final String MYSQL_URL = "jdbc:mysql://mysql.iei.liu.se:5432";

    private static ConcurrentLinkedQueue<Connection> conStack = new ConcurrentLinkedQueue<>();

    static {
        try {
            Class.forName(MYSQL_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        Connection con = conStack.poll();
        if (con == null)
            try {
                con = DriverManager.getConnection(MYSQL_URL, "pgiei02", "w3baU9tfF6,I");
                return con;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        return con;
    }

    public static void returnConnection(Connection con) {
        conStack.add(con);
    }
}