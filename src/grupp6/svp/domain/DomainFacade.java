package grupp6.svp.domain;

import java.util.List;

import javax.servlet.http.HttpSession;

import grupp6.svp.data.DataFacade;

/**
 * 	Real Logic Facade
 * 	
 * 	
 * 	
 *	
 */
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