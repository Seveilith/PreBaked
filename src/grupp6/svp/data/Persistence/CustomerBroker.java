package grupp6.svp.data.Persistence;

import grupp6.svp.data.DataTransferObjects.DataTransferObject;
import grupp6.svp.data.DbConnect;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.UUID;

/**
 * Created by alo on 2017-05-08.
 */
public class CustomerBroker extends Broker {


    @Override
    public void insert(DataTransferObject object) {

    }

    @Override
    public void update(DataTransferObject object) {

    }

    @Override
    public void delete(DataTransferObject object) {

    }

    @Override
    public Object getFromStorage(int id, Connection con) {
        return null;
    }
}

