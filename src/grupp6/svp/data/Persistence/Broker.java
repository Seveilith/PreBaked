package grupp6.svp.data.Persistence;

import grupp6.svp.data.DataTransferObjects.DataTransferObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    //Lade till denna metod efter att lagt till PFacade och find-koden i datafacade enligt crusoes slides 9 maj//Malin
    public List<DataTransferObject> find(DataTransferObject data){
        List<DataTransferObject> list = new ArrayList<>();

        return list;
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
