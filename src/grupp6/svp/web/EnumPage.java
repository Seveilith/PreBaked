package grupp6.svp.web;

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
     * Page where admin important information is displayed. This page is generated
     * and will only show if the Admin is logged in.
     */
    ADMIN,
    /*
    * Page that shows products
    * */
    PRODUCTS,

}
