package grupp6.svp.data;

import grupp6.svp.data.DataTransferObjects.*;
import grupp6.svp.data.Persistence.*;
import grupp6.svp.domain.User;
import java.util.HashMap;
import java.util.List;

public class DataFacade {

    private static DataFacade instance = null;
    private PFacade per;

    /**
     * === USERS ===
     * This part of the facade handles construction of ghost users
     **/
    private static HashMap<String, User> users = new HashMap<>();

    static { //Add, remove, or edit Users for the system here
        new User("Test", "Test");
        new User("Admin01", "Test");
        new User("Kund1@gmail.com", "Test");
        new User("Kund2@gmail.com", "Test");
        new User("Desig11", "Test");
        new User("Desig12", "Test");
    }

    public static DataFacade instance() {

        if (instance == null)
            instance = new DataFacade();
        instance.register();
        return instance;
    }

    public void register() {
        per = new PFacade();
        per.register(ProductData.class, new ProductBroker());
    }

    public DataTransferObject find(DataTransferObject dto) {
        return per.find(dto);
    }

    public List<DataTransferObject> getAllFromStorage(DataTransferObject dto) {
        return per.getAllFromStorage(dto);
    }

    public void delete(DataTransferObject dto) {
        per.delete(dto);
    }

    public void insert(DataTransferObject dto) {
        per.insert(dto);
    }

    /**
     * This method is for registering users in the data facade, it is called every time a user object is initiated.
     *
     * @param user a user object that wants to be registered in the data facade.
     */
    public static void register(User user) {
        users.put(user.getUsername(), user);
    }

    /**
     * This method is used to fetch users in the data facade.
     *
     * @param username the username of a specifc user.
     * @return returns a user object identifed from the username inserted, if the user dosn't exist null is returned.
     */
    public static User getUser(String username) {
        return users.get(username);
    }
}