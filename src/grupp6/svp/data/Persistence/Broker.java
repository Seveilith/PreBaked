package grupp6.svp.data.Persistence;

import grupp6.svp.data.DataTransferObjects.DataTransferObject;
import grupp6.svp.data.DbConnect;
import sun.security.util.ObjectIdentifier;

import java.io.ObjectInput;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * Created by alo on 2017-05-03.
 */
public abstract class Broker {

    protected HashMap<Integer, Object> cache = new HashMap<Integer,Object>();

    protected DbConnect dbCon;

    public Broker(){
        dbCon = new DbConnect();
    }

    public abstract void insert(DataTransferObject object, Connection con);

    public abstract List<DataTransferObject> find(DataTransferObject obj);

    public abstract void update(DataTransferObject object);

    public abstract void delete(DataTransferObject object, Connection con);

    public abstract DataTransferObject getFromStorage(int id, Connection con); //id: ObjectIdentifier


}
