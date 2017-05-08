package grupp6.svp.data.Persistence;

/**
 * Created by alo on 2017-05-03.
 */
public abstract class Broker {

    public void insert(Object object){}

    public void findAll(Object[] object){}

    public void find(Object object){}

    public void update(Object object){}

    public void delete(Object object){}

    public abstract void insertStorage(Object object);

    public abstract void getAllFromStorage(Object[] object);

    //public abstract void getFromStorage(Objectidentifier id); //id: ObjectIdentifier

    public abstract void getFromStorage(Object object); //object: Object

    public abstract void updateStorage(Object object);

    public abstract void deleteStorage(Object object);

}
