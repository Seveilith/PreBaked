package grupp6.svp.data.Persistence;

import grupp6.svp.data.DataTransferObjects.DataTransferObject;
import grupp6.svp.data.DbConnect;

import java.util.HashMap;
import java.util.UUID;

/**
 * Created by alo on 2017-05-03.
 */
public abstract class Broker {

    private HashMap<UUID, Object> cache = new HashMap<UUID,Object>();

    protected DbConnect dbCon;

    public Broker(){
        dbCon = new DbConnect();
    }

    public abstract void insert(DataTransferObject object);

    public Object find(UUID id){
        if (cache.containsKey(id))
            return cache.get(id);

        Object obj = this.getFromStorage(id); //OCH CONNECTIOn
        cache.put(id,obj);
        return obj;
    }

    public abstract void update(DataTransferObject object);

    public abstract void delete(DataTransferObject object);

    public abstract Object getFromStorage(UUID id); //id: ObjectIdentifier
}
