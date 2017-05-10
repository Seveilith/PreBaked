package grupp6.svp.data.Persistence;

import grupp6.svp.data.DataTransferObjects.AdminData;
import grupp6.svp.data.DataTransferObjects.DataTransferObject;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

public class AdminBroker extends Broker {

    @Override
    public void insert(DataTransferObject object) {

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
    public void delete(DataTransferObject object) {

    }

    @Override
    public Object getFromStorage(UUID id) {
        return null;
    }

}