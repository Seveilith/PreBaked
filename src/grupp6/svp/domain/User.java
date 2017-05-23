package grupp6.svp.domain;

import grupp6.svp.data.DataFacade;

public class User {

    private final String username, password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;

        DataFacade.register(this);
    }


    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
