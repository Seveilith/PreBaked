package grupp6.svp.data;

<<<<<<< Updated upstream
/**
 * Created by LinnPettersson on 2017-05-03.
 */
public class Database {
}
=======
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Connection conn = null;

    public static void main(String[] args){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/mysql.iei.liu.se:5432?" + "user=pgiei02&password=w3baU9tfF6,I");
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}
>>>>>>> Stashed changes
