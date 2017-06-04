package grupp6.svp.data.Persistence;

import grupp6.svp.data.DataTransferObjects.DataTransferObject;
import grupp6.svp.data.DbConnect;
import java.util.HashMap;
import java.util.List;

public class PFacade {
    protected HashMap<Class<?>, Broker> brokers = new HashMap<>();

    public void register(Class<?> cls, Broker broker) {
        brokers.put(cls, broker);
    }

    public DataTransferObject find(DataTransferObject data) {
        Broker broker = brokers.get(data.getClass());

        return broker.find(data);
    }

    public void delete(DataTransferObject data) {
        Broker broker = brokers.get(data.getClass());

        broker.delete(data, DbConnect.getConnection());
    }

    public void insert(DataTransferObject data) {
        Broker broker = brokers.get(data.getClass());

        broker.insert(data, DbConnect.getConnection());
    }

    public List<DataTransferObject> getAllFromStorage(DataTransferObject data) {
        Broker broker = brokers.get(data.getClass());

        return broker.getAllFromStorage(DbConnect.getConnection());
    }
}