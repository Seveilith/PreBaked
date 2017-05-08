package grupp6.svp.data;

/**
 * Created by alo on 2017-05-03.
 */
public abstract class Broker {

    public void insert(Object object){}

    public void findAll(Object[] object){}

    public void find(Object object){}

    public void update(Object object){}

    public void delete(Object object){}

    public abstract void insertStorage();

    public abstract void getAllFromStorage();

    public abstract void getFromStorage(); //id: ObjectIdentifier

    // public abstract void getFromStorage(); //object: Object

    public abstract void updateStorage();

    public abstract void deleteStorage();

}
