package grupp6.svp.data.Persistence;

import java.util.HashMap;
import java.util.UUID;

/**
 * Created by alo on 2017-05-03.
 */
public abstract class Broker {

    private HashMap<UUID, Object> cache = new HashMap<UUID,Object>();

    public void insert(Object object){}

    public void findAll(Object[] object){}

    public Object find(UUID id){
        if (cache.containsKey(id))
            return cache.get(id);

        Object obj = this.getFromStorage(id);
        cache.put(id,obj);
        return obj;
    }

    public void update(Object object){}

    public void delete(Object object){}

    public abstract void insertStorage(Object object);

    public abstract void getAllFromStorage(Object[] object);

    public abstract Object getFromStorage(UUID id); //id: ObjectIdentifier

    //public abstract void getFromStorage(Object object); //object: Object

    public abstract void updateStorage(Object object);

    public abstract void deleteStorage(Object object);

}
