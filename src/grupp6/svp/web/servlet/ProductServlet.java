package grupp6.svp.web.servlet;

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



    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getParameter("id"));
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PageFactory.instance().answer(request, response, EnumPage.LOGIN);
    }
}