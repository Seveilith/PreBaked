package grupp6.svp.web;

/**
 * This enum helps us see what pages exists on this website,
 * both static and dynamic. The enum collaborates with the
 * PageFactory to guide users between different pages.
 * Below you can see links that explain each of the enum values more;
 * <p>
 * <li>{@link #HOME}</li>
 *
 * @author joncr49
 */
public enum EnumPage {

    /**
     * The home page is a static page; index.jsp
     * This is the home page of the website, it is here that everything starts.
     */
    HOME,
    /**
     * The login page is a dynamic page accessed through the LoginServlet.
     * The page have two different possibilities to be displayed:
     * <p>
     * either the user successfully log in and a page is generated...
     * OR	  the user fails to log in and see the login_failed.jsp.
     */
    LOGIN,
    /**
     * LOGOUT is a "page" that for the client is only a redirect, while on the server a reset of session happens.
     */
    LOGOUT,
    /**
     * Page where user important information is displayed. This page is generated
     * and will only show if the user is online.
     */
    USER_HOME,

    PRODUCTS,

}
