package grupp6.svp.web.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import grupp6.svp.domain.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import grupp6.svp.web.EnumPage;
import grupp6.svp.web.PageFactory;
/**
 * Created by LinnPettersson on 2017-05-03.
 */
@WebServlet(name="basket", urlPatterns={"/basket"})
public class BasketServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = "Using GET Method to Read Form Data";

        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " +
                "transitional//en\">\n";

        out.println(docType + "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>Id</b>: "
                + request.getParameter("balloon_Id") + "\n" +
                "  <li><b>Färg</b>: "
                + request.getParameter("balloon_col") + "\n" +
                "</ul>\n" +
                "</body></html>");

        DomainFacade.instance().createBalloon(request.getParameter("balloon_Id"), request.getParameter("balloon_col"));

    }

}