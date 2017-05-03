package grupp6.svp.data;

import java.sql.*;

public class DbConnect {
    private String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
    private String MYSQL_URL = "jdbc:mysql://mysql.iei.liu.se:5432";

    private Connection con;
    private Statement st;
    private ResultSet rs;

    public DbConnect() {

        try {
            Class.forName(MYSQL_DRIVER);
            System.out.println("Class Loaded....");
            con = DriverManager.getConnection(MYSQL_URL,"pgiei02","w3baU9tfF6,I");
            System.out.println("Connected to the database....");
            st = con.createStatement();


            rs = st.executeQuery("SELECT * FROM pgiei02.Customer;");

            while(rs.next()){
                String admin = rs.getString("CustomerPassword");
                System.out.println(admin);
            }

            System.out.println(rs);
            con.close();

        } catch(ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException:\n"+ex.toString());
            ex.printStackTrace();

        } catch(SQLException ex) {
            System.out.println("SQLException:\n"+ex.toString());
            ex.printStackTrace();
        }
    }

    public static void main(String...args) {
        new DbConnect();
    }
}