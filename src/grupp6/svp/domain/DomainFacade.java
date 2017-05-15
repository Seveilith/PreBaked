package grupp6.svp.domain;

import java.util.HashMap;
import java.util.List;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import grupp6.svp.data.DataFacade;
import grupp6.svp.data.DataTransferObjects.*;
import grupp6.svp.web.servlet.*;


public class DomainFacade {

	private static DomainFacade instance = null;

	/**
	 *
	 * @return
	 */
	public static DomainFacade instance(){
		if(instance == null)
			instance = new DomainFacade();
		return instance;
	}

	protected HashMap<Class<?>, DomainObject> domserv = new HashMap<>();

	public DomainObject getDTO(HttpServlet servlet){
		domserv.put(AdminServlet.class, new Admin());
		domserv.put(BasketServlet.class, new Basket());
		domserv.put(CustomerServlet.class, new Customer());
		domserv.put(DesignerServlet.class, new Designer());
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
		if(user == null)
			return false;
		
		return user.username.equals(username) && user.password.equals(password);
	}

	//Har försökt kommunicera med basketservlet och genom den kalla pa dfacaden som skapar en ballong //Malin
	public static void createBalloon(String balloonId, String balloonColour){
		Balloon tmp = new Balloon(balloonId, balloonColour);
	}

	public static List<Activity> getActivitites(String username) {
		User user = DataFacade.getUser(username);
		if(user == null)
			return null;
		
		return DataFacade.getActivity(user);
	}

	public static void logout(HttpSession session) {
		session.removeAttribute("Username");
	}
}