package grupp6.svp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ElementBuilder {

    /**
     * CONTAINERS
     **/
    public static void addHead(PrintWriter output, String title) {
        output.append("<html>");
        output.append("<head>");
        output.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">");
        output.append("<title>" + title + "</title>");
        output.append("<link rel='stylesheet' type='text/css' href='./files/css/style.css'>");
        output.append("</head>");
        output.append("<body>");
    }

    public static void addHeader(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/header.jsp").include(request, response);
    }

    static void addLeftPanel(PrintWriter output, String content) {
        output.append("<div class=\"leftPanel\">");
        output.append(content);
        output.append("</div>");
    }

    static void addCenterPanel(PrintWriter output, String content) {
        output.append("<div class=\"centerPanel\">");
        output.append(content);
        output.append("</div>");
    }

    static void addFooter(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/footer.jsp").include(request, response);
    }

    public static void addDeleteMsg(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter output = response.getWriter();
        response.setContentType("text/html");

        output.append("<div class=\"deletemsg\">");
        output.append("<p> Deleted row</p>");
        output.append("</div>");
    }

    static void addEnd(PrintWriter output) {
        output.append("</body>");
        output.append("</html>");
    }

    public static void addProducts(HttpServletRequest request, HttpServletResponse response, PrintWriter output) throws ServletException, IOException {
        output.append("<table style=\"width:100%\">\n" +
                "  <tr>\n" +
                "    <th>Firstname</th>\n" +
                "    <th>Lastname</th> \n" +
                "    <th>Age</th>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td>Jill</td>\n" +
                "    <td>Smith</td> \n" +
                "    <td>50</td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td>Eve</td>\n" +
                "    <td>Jackson</td> \n" +
                "    <td>94</td>\n" +
                "  </tr>\n" +
                "</table>");
    }

    /**
     * CONTENT
     **/
    static String getMenu() {
        String menu = "<div class=\"menu\">";
        menu += "<p><a href='login'>Home</a><br></p>";
        menu += "<p><a href='user'>User Home</a><br></p>";
        menu += "<p><a href='logout'>Logout</a></p>"; //"Logout"

        menu += "</div>";
        return menu;
    }
}