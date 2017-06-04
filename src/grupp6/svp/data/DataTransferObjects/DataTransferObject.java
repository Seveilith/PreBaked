package grupp6.svp.data.DataTransferObjects;

import java.io.Serializable;

public abstract class DataTransferObject implements Serializable{
    public abstract int getId();
    public abstract void setId(int id);
}
