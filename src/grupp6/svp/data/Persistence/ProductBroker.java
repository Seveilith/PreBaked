package grupp6.svp.data.Persistence;

import java.sql.*;
import java.util.UUID;

/**
 * Created by alo on 2017-05-08.
 */
public class ProductBroker extends Broker {

    private String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
    private String MYSQL_URL = "jdbc:mysql://mysql.iei.liu.se:5432";

    private Connection con;
    private Statement st;
    private ResultSet rs;

    public void DbConnect() {

        try {
            Class.forName(MYSQL_DRIVER);
            System.out.println("Class Loaded....");
            con = DriverManager.getConnection(MYSQL_URL,"pgiei02","w3baU9tfF6,I");
            System.out.println("Connected to the database....");
            st = con.createStatement();


            rs = st.executeQuery("SELECT * FROM pgiei02.Product;");

            while(rs.next()){
                String admin = rs.getString("CustomerPassword");
                System.out.println(admin);
            }

            con.close();

        } catch(ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException:\n"+ex.toString());
            ex.printStackTrace();

        } catch(SQLException ex) {
            System.out.println("SQLException:\n"+ex.toString());
            ex.printStackTrace();
        }
    }

    @Override
    public void insertStorage(Object object) {}

    @Override
    public void getAllFromStorage(Object[] object) {}

    @Override
    public Object getFromStorage(UUID id) {
        return null;
    }

    //@Override
    //public void getFromStorage(Objectidentifier id) {}

    //@Override
    //public void getFromStorage(Object object) {}

    @Override
    public void updateStorage(Object object) {}

    @Override
    public void deleteStorage(Object object) {}
}
