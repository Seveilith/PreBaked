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
@WebServlet(name="Basket", urlPatterns={"/Basket"})
public class BasketServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

        String str = req.getParameter("in");

        PrintWriter out = res.getWriter();
        out.println(str);

        String str2 = req.getParameter("mar");

        PrintWriter out2 = res.getWriter();
        out.println(str2);
    }
}