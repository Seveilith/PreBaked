package grupp6.svp.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import grupp6.svp.web.EnumPage;
import grupp6.svp.web.PageFactory;

/**
 * @author joncr49
 */

@WebServlet(name = "user", urlPatterns = {"/user"})
public class UserHomeServlet extends HttpServlet {
    private static final long serialVersionUID = 8959044322742301997L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserHomeServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PageFactory.instance().answer(request, response, EnumPage.USER_HOME);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PageFactory.instance().answer(request, response, EnumPage.USER_HOME);
    }

}
