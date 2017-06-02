package grupp6.svp.web.servlet;

import grupp6.svp.data.DataFacade;
import grupp6.svp.data.DataTransferObjects.ProductData;
import grupp6.svp.domain.DomainFacade;
import grupp6.svp.domain.DomainObjects.Product;
import grupp6.svp.web.EnumPage;
import grupp6.svp.web.PageFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AdminServlet", urlPatterns = {"/admin"})
public class AdminServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        controlUser(request, response);
        PageFactory.instance().answer(request, response, EnumPage.ADMIN);

        if (request.getParameterMap().containsKey("operation")) {
            if (request.getParameter("operation").equals("delete")) {
                deleteProduct(request, response);
            }

            if (request.getParameter("operation").equals("insert")) {
                insertProduct(request, response);
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    private void controlUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = (String) request.getSession().getAttribute("Username");

        if (username == null) {
            System.out.println("PreBaked: Username is not defined -> User is not logged in! Redirecting to index.jsp");
            response.sendRedirect("/index.jsp");
        } else if (username.charAt(5) != '0') {
            System.out.println("PreBaked: Username is not an Admin! Redirecting to index.jsp");
            response.sendRedirect("/index.jsp");
        }
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DataFacade.instance().delete(new ProductData(Integer.parseInt(request.getParameter("id"))));
    }

    private void insertProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DomainFacade.instance().insert(request, response, new Product());
    }
}