package grupp6.svp.data.Persistence;

import grupp6.svp.data.DataTransferObjects.DataTransferObject;

import java.sql.Connection;
import java.util.List;
import java.util.UUID;

/**
 * Created by alo on 2017-05-08.
 */
public class BasketBroker extends Broker {

    @Override
    public void insert(DataTransferObject object, Connection con) {

    }

    @Override
    public void update(DataTransferObject object) {

    }

    @Override
    public List<DataTransferObject> find(DataTransferObject obj) {
        return null;
    }

    @Override
    public void delete(DataTransferObject object, Connection con) {

    }

    @Override
    public DataTransferObject getFromStorage(int id, Connection con) {
        return null;
    }
}
