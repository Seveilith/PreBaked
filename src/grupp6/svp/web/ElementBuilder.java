package grupp6.svp.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ElementBuilder {

    /**
     * CONTAINERS
     **/
    public static void addTop(PrintWriter output) {
        output.print("<!DOCTYPE html>\n" +
                "<html lang=\"en\">");
    }

    public static void addHead(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/head.jsp").include(request, response);
    }

    public static void addNavBar(HttpServletRequest request, HttpServletResponse response, PrintWriter out) throws ServletException, IOException {
        request.getRequestDispatcher("/navbar.jsp").include(request, response);
    }

    public static void addEnd(HttpServletRequest request, HttpServletResponse response, PrintWriter out) throws ServletException, IOException {
        request.getRequestDispatcher("footer.jsp").include(request, response);
        out.print("</body>");
        out.append("</html>");
    }

    public static void addInsertForm(PrintWriter out) {
        out.print("<form action=\"admin\" method=\"POST\">");
        out.print("<table class=\"product_input\">");
        out.print("<h2>Mata in en ny produkt</h2>");
        out.print("<tr>");
        out.print("<th>ID:</th>");
        out.print("<th>Produktnamn:</th>");
        out.print("<th>Beskrivning:</th>");
        out.print("<th>Pris:</th>");
        out.print("<th>Antal i lager:</th></tr>");
        out.print("<tr>");
        out.print("<td><input type=\"text\" name=\"id\" placeholder=\"ProductId\"></td>");
        out.print("<td><input type=\"text\" name=\"name\" placeholder=\"Name\" value=\"\" ></td>");
        out.print("<td><input type=\"text\" name=\"description\" placeholder=\"Description\"></td>");
        out.print("<td><input type=\"text\" name=\"price\" placeholder=\"Price\"></td>");
        out.print("<td><input type=\"text\" name=\"quantity\" placeholder=\"Quantity\"></td>");
        out.print("<td><input type =\"hidden\" name=\"operation\" value=\"insert\"></td></tr></table>");
        out.print("<input type=\"submit\" value=\"Submit\"></form>");
    }

    public static void addDeleteForm(PrintWriter out) {
        out.print("<h2>Delete Product </h2>");
        out.print("<form action=\"admin\" method=\"POST\">");
        out.print("<input type=\"text\" name=\"id\">");
        out.print("<input type=\"hidden\" name=\"operation\" value=\"delete\">");
        out.print("<input type=\"submit\" value=\"Delete\"></form>");
    }

    public static void addWrapper(PrintWriter out) {
        out.print("<div class=\"container\">");
    }

    public static void endWrapper(PrintWriter out) {
        out.print("</div>");
    }
}