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

    public void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        Basket shoppingBasket;
        shoppingBasket = (Basket) session.getAttribute("basket");
        if(shoppingBasket == null){
            shoppingBasket = new Basket();
            session.setAttribute("basket", shoppingBasket);
        }
        String name = request.getParameter("name");
        Integer price = Integer.parseInt(request.getParameter("price"));
        shoppingBasket.addToBasket(name, price);
        session.setAttribute("basket", shoppingBasket);
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>result</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Pizza successfully added to cart </h1>");
            out.println("<form action='index.html'>Add more pizza item<input type='submit' value='go'></form>");
            out.println("<hr>");
            out.println("<h2>Cart</h2>");
            HashMap<String, Integer> items = shoppingBasket.getBasketItems();
            out.println("<table border='1px'>");

            for(String key: items.keySet()){
                out.println("<tr><td>"+key+" - </td><td>"+"$"+items.get(key)+"</td></tr>");
            }
            out.println("<table>");
            out.println("</body>");
            out.println("</html>");

        }
    }
}