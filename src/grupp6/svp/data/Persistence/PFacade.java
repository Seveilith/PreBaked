package grupp6.svp.data.Persistence;
import grupp6.svp.data.DataTransferObjects.DataTransferObject;

import java.util.HashMap;
import java.util.List;

/**
 * Created by malinvagnborg on 2017-05-09.
 */
public class PFacade {
    protected HashMap<Class<?>, Broker> brokers = new HashMap<>();

    public void register(Class<?> cls, Broker broker){}

    public List<DataTransferObject> find(DataTransferObject data){
        Broker broker = brokers.get(data.getClass());
        System.out.println("PFACADE");
        return broker.find(data);
    }
}
