
package grupp6.svp.data.Persistence;

import grupp6.svp.data.DataTransferObjects.AdminData;
import grupp6.svp.data.DataTransferObjects.DataTransferObject;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

public class AdminBroker extends Broker {

    @Override
    public void insert(DataTransferObject object, Connection con) {

    }

    @Override
    public List<DataTransferObject> find(DataTransferObject obj) {
        return null;
    }

    @Override
    public void update(DataTransferObject object) {
        AdminData admin = (AdminData) object;

        String updateTableSQL = "UPDATE pgiei02.Administrator " +
                "SET AdminFirstName = ?, AdminLastName = ?, AdminMail = ?, AdminPassword = ?";

        try {
            PreparedStatement preparedStatement = dbCon.getConnection().prepareStatement(updateTableSQL);
            preparedStatement.setString(1, admin.getAdminFirstName());
            preparedStatement.setString(2, admin.getAdminLastName());
            preparedStatement.setString(3, admin.getAdminMail());
            preparedStatement.setString(4, admin.getAdminPassword());
            preparedStatement.executeUpdate();
            dbCon.returnConnection(dbCon.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(DataTransferObject object, Connection con) {

    }

    @Override
    public DataTransferObject getFromStorage(int id, Connection con) {
        return null;
    }


}
