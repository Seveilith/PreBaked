package grupp6.svp.web.servlet;

import grupp6.svp.data.DataFacade;
import grupp6.svp.data.DataTransferObjects.ProductData;
import grupp6.svp.domain.DomainFacade;
import grupp6.svp.web.EnumPage;
import grupp6.svp.web.PageFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by LinnPettersson on 2017-05-10.
 */
@WebServlet(name="product", urlPatterns={"/product"})
public class ProductServlet extends HttpServlet {

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
    }


    //// TANKEN ÄR ATT VI HÄR BARA SKA SKICKA VIDARE RESPONSE OCH REQUEST TILL RÄTT STÄLLE ALLTSÅ RÄTT FASAD, DENNA SKA SEDAN DELEGERA UPPGIFTEN
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DataFacade.instance().answer(response,request);

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DomainFacade.instance().answer(response,request);
    }
}


