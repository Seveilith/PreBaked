package grupp6.svp.data.DataTransferObjects;

import java.io.Serializable;

public abstract class DataTransferObject implements Serializable{

    public abstract int getId();

    public void save() {
    }

    public void reload() {
    }

    public void delete() {
    }

    public abstract void setId(int id);
}
