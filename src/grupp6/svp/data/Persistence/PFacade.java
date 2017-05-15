package grupp6.svp.data.Persistence;
import grupp6.svp.data.DataFacade;
import grupp6.svp.data.DataTransferObjects.DataTransferObject;
import grupp6.svp.data.DbConnect;

import java.util.HashMap;
import java.util.List;

/**
 * Created by malinvagnborg on 2017-05-09.
 */
public class PFacade {
    protected HashMap<Class<?>, Broker> brokers = new HashMap<>();

    public void register(Class<?> cls, Broker broker){
        brokers.put(cls, broker);
    }

    public List<DataTransferObject> find(DataTransferObject data){
        Broker broker = brokers.get(data.getClass());

        System.out.println("HERRO");

        return broker.find(data);
    }

    public void delete(DataTransferObject data){
        Broker broker = brokers.get(data.getClass());

        broker.delete(data, DbConnect.getConnection());
    }

    public void insert(DataTransferObject data){
        Broker broker = brokers.get(data.getClass());

        System.out.println("I pFacade");

        broker.insert(data, DbConnect.getConnection());
    }
}
