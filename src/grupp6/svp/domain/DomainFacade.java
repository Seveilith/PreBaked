package grupp6.svp.domain;

import java.util.HashMap;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import grupp6.svp.data.DataFacade;
import grupp6.svp.data.DataTransferObjects.*;
import grupp6.svp.web.servlet.*;

public class DomainFacade {

	private static DomainFacade instance = null;

	public static DomainFacade instance(){
		if(instance == null)
			instance = new DomainFacade();
		return instance;
	}

	private HashMap<Class<?>, DomainObject> domserv = new HashMap<>();

	private DomainObject getDTO(HttpServlet servlet){
		domserv.put(BasketServlet.class, new Basket());
		domserv.put(ProductServlet.class, new Product());

		return domserv.get(servlet.getClass());
	}

	public void answer(HttpServletResponse response, HttpServletRequest request, HttpServlet servlet){

		DomainObject obj = getDTO(servlet);

		if (request.getParameter("operation").equals("insert")){
			DataTransferObject dto = obj.create(response, request);

			DataFacade.instance().insert(dto);
		}
	}


	public static boolean canLogin(String username, String password) {
		User user = DataFacade.getUser(username);

		return user != null && user.getUsername().equals(username) && user.getPassword().equals(password);

	}

	public static void logout(HttpSession session) {
		session.removeAttribute("Username");
	}
}