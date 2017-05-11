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

    private HashMap<Integer, Object> cache = new HashMap<Integer,Object>();

    protected DbConnect dbCon;

    public Broker(){
        dbCon = new DbConnect();
    }

    public abstract void insert(DataTransferObject object);

    public List<DataTransferObject> find(DataTransferObject obj){
        if (cache.containsKey(obj.getId()))
            //return cache.get(obj.getId());

        //DataTransferObject temp = new DataTransferObject();

       // temp.getFromStorage(obj.getId(), dbCon.getConnection())); //OCH CONNECTIOn
        //cache.put(temp.getId(), obj);

        System.out.println("TESTING TESTING");

        return null;
    }

    public abstract void update(DataTransferObject object);

    public abstract void delete(DataTransferObject object);

    public abstract Object getFromStorage(int id, Connection con); //id: ObjectIdentifier


}
