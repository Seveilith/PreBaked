package grupp6.svp.web;

import grupp6.svp.data.DataFacade;
import grupp6.svp.data.DataTransferObjects.DataTransferObject;
import grupp6.svp.data.DataTransferObjects.ProductData;
import grupp6.svp.domain.DomainFacade;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PageFactory {
    private static PageFactory instance = null;

    public static PageFactory instance() {
        if (instance == null)
            instance = new PageFactory();
        return instance;
    }

    public void answer(HttpServletRequest request, HttpServletResponse response, EnumPage page) {
        try {
            switch (page) {
                case HOME:
                    response.sendRedirect("index.jsp");
                    break;
                case LOGIN:
                    String username = request.getParameter("username");
                    String password = request.getParameter("password");
                    login(request, response, username, password);
                    break;
                case LOGOUT:
                    HttpSession session = request.getSession();
                    DomainFacade.logout(session);
                    answer(request, response, EnumPage.HOME);
                    break;
                case PRODUCTS:
                    products(request, response);
                    break;
                case ADMIN:
                    admin(request, response);
                    break;
                default:
                    break;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void login(HttpServletRequest request, HttpServletResponse response, String username, String password) throws IOException, ServletException {
        HttpSession session = request.getSession();
        String u = (String) session.getAttribute("Username");

        if (u == null && !DomainFacade.canLogin(username, password)) {
            response.sendRedirect("login_failed.jsp"); //Username & password are incorrect we respond with a redirect to login_failed.jsp
            return;
        } else if (u == null) {
            session.setAttribute("Username", username);
        }

        if (username.indexOf('@') >= 0) {
            response.sendRedirect("customer.jsp");
        } else if (username.charAt(5) == '0') {
            response.sendRedirect("/admin");
        } else if (username.charAt(5) == '1') {
            response.sendRedirect("designer.jsp");
        }
    }

    private void products(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ProductData> products = new ArrayList<>();

        for (DataTransferObject dto : DataFacade.instance().getAllFromStorage(new ProductData())) {
            products.add((ProductData) dto);
        }

        PrintWriter out = response.getWriter();
        ElementBuilder.addTop(out);
        ElementBuilder.addHead(request, response);

        ElementBuilder.addNavBar(request, response, out);
        out.print("<div class=\"container\">");
        out.print("<div class=\"table-responsive\">");
        out.print("<table class=\"table\">");
        out.print("<tr>");
        out.print("<th>ProductName</th>");
        out.print("<th>ProductDescription</th>");
        out.print("<th>ProductPrice</th>");
        out.print("<th>ProductQuantity</th></tr>");

        if (products != null) {
            for (ProductData data : products) {
                out.print("<tr><td>" + data.getProductName() + "</td>");
                out.print("<td>" + data.getProductDescription() + "</td>");
                out.print("<td>" + data.getProductPrice() + "</td>");
                out.print("<td>" + data.getProductQuantity() + "</td></tr>");
            }
            out.print("</table></div></div></body></html>");
        }
        ElementBuilder.addEnd(request, response, out);
    }

    private void admin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        ElementBuilder.addTop(out);
        ElementBuilder.addHead(request, response);
        ElementBuilder.addNavBar(request, response, out);
        ElementBuilder.addWrapper(out);
        ElementBuilder.addDeleteForm(out);
        ElementBuilder.addInsertForm(out);
        ElementBuilder.endWrapper(out);
        ElementBuilder.addEnd(request, response, out);
    }
}