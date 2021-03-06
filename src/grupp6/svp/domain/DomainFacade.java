package grupp6.svp.domain;

import grupp6.svp.data.DataFacade;
import grupp6.svp.domain.DomainObjects.DomainObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DomainFacade {
    private static DomainFacade instance = null;

    public static DomainFacade instance() {
        if (instance == null)
            instance = new DomainFacade();
        return instance;
    }

    public void insert(HttpServletRequest request, HttpServletResponse response, DomainObject newObject){
        DataFacade.instance().insert(newObject.create(request, response));
    }

    public static boolean canLogin(String username, String password) {
        User user = DataFacade.getUser(username);
        return user != null && user.getUsername().equals(username) && user.getPassword().equals(password);
    }

    public static void logout(HttpSession session) {
        System.out.println("Terminating session for user: " + session.getAttribute("Username"));
        session.removeAttribute("Username");
    }
}