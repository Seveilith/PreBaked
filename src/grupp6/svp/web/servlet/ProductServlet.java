package grupp6.svp.web.servlet;

import grupp6.svp.data.DataFacade;
import grupp6.svp.data.DataTransferObjects.ProductData;
import grupp6.svp.domain.DomainFacade;
import grupp6.svp.web.ElementBuilder;
import grupp6.svp.web.EnumPage;
import grupp6.svp.web.PageFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "product", urlPatterns = {"/product"})
public class ProductServlet extends HttpServlet {

    public ProductServlet() {
        super();
    }

    //// Kan inte utföra något efter redirect
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DomainFacade.instance().answer(response, request, this);
        DataFacade.instance().answer(response, request, this);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}


