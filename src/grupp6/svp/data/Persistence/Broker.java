package grupp6.svp.data.Persistence;

import grupp6.svp.data.DataTransferObjects.DataTransferObject;
import grupp6.svp.data.DbConnect;

import java.sql.Connection;
import java.util.List;

public abstract class Broker {

    DbConnect dbCon;

    Broker() {
        dbCon = new DbConnect();
    }

    public abstract void insert(DataTransferObject object, Connection con);

    public abstract List<DataTransferObject> find(DataTransferObject obj);

    public abstract void update(DataTransferObject object);

    public abstract void delete(DataTransferObject object, Connection con);

    public abstract DataTransferObject getFromStorage(int id, Connection con); //id: ObjectIdentifier

    public abstract List<DataTransferObject> getAllFromStorage(Connection con);

}
