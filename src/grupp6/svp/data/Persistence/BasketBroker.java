package grupp6.svp.data.Persistence;

import java.util.UUID;

/**
 * Created by alo on 2017-05-08.
 */
public class BasketBroker extends Broker {
    @Override
    public void insertStorage(Object object) {}

    @Override
    public void getAllFromStorage(Object[] object) {}

    @Override
    public Object getFromStorage(UUID id) {
        return null;
    }

    //@Override
    //public void getFromStorage(Objectidentifier id) {}

    @Override
    public void updateStorage(Object object) {}

    @Override
    public void deleteStorage(Object object) {}
}
