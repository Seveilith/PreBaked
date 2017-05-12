package grupp6.svp.data.DataTransferObjects;

import sun.security.util.ObjectIdentifier;

/**
 * Created by alo on 2017-05-08.
 */
public abstract class DataTransferObject {

    //Objectidentifier id;

    public abstract int getId();

    public void save(){};

    public void reload(){};

    public void delete(){};
}
