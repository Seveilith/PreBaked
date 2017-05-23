package grupp6.svp.data.DataTransferObjects;

public abstract class DataTransferObject {

    public abstract int getId();

    public void save(){}

    public void reload(){}

    public void delete(){}

    public abstract void setId(int id);
}
