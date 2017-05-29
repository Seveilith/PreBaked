package grupp6.svp.data.Persistence;

import grupp6.svp.data.DataTransferObjects.DataTransferObject;
import grupp6.svp.data.DbConnect;

import java.sql.Connection;
import java.util.List;

public abstract class Broker {

    public abstract void insert(DataTransferObject object, Connection con);

    public abstract DataTransferObject find(DataTransferObject obj);

    public abstract void delete(DataTransferObject object, Connection con);

    public abstract DataTransferObject getFromStorage(int id, Connection con);

    public abstract List<DataTransferObject> getAllFromStorage(Connection con);

}
