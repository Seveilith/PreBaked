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

	public static boolean canLogin(String username, String password) {
		User user = DataFacade.getUser(username);
		if(user == null)
			return false;
		
		return user.username.equals(username) && user.password.equals(password);
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