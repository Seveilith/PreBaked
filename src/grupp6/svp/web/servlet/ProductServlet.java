package grupp6.svp.web.servlet;

import grupp6.svp.data.DataFacade;
import grupp6.svp.data.DataTransferObjects.DataTransferObject;
import grupp6.svp.data.DataTransferObjects.ProductData;
import grupp6.svp.domain.DomainFacade;
import grupp6.svp.web.ElementBuilder;
import grupp6.svp.web.EnumPage;
import grupp6.svp.web.PageFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "product", urlPatterns = {"/product"})
public class ProductServlet extends HttpServlet {

    public ProductServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        loadProducts(response, request);

        request.getRequestDispatcher("/WEB-INF/productPage.jsp").forward(request, response);

        DomainFacade.instance().answer(response, request, this);
        DataFacade.instance().answer(response, request, this);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //PageFactory.instance().answer(request, response, EnumPage.PRODUCTS);
    }

    private void loadProducts(HttpServletResponse response, HttpServletRequest request) {
        List<ProductData> products = getAllFromStorage();
        HttpSession session = request.getSession(true);
        session.setAttribute("products", products);
    }

    private List<ProductData> getAllFromStorage(){
        ProductData data = new ProductData();
        List<DataTransferObject> DTOs = DataFacade.instance().getAllFromStorage(data);
        List<ProductData> products = new ArrayList<>();

        for (DataTransferObject dto: DTOs){
            products.add((ProductData)dto);
        }
        return products;
    }
}


