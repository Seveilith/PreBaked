package grupp6.svp.data;

import grupp6.svp.data.DataTransferObjects.DataTransferObject;
import grupp6.svp.data.DataTransferObjects.ProductData;
import grupp6.svp.data.Persistence.PFacade;
import grupp6.svp.domain.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class DataFacade {

//	public static Product getProduct(int productId){
//		return
//	}

//	public static void register(User user) {
//		users.put(user.username, user);
//	}
//
//
//	public static User getUser(String username){
//		return users.get(username);
//	}

	protected PFacade per;

	public void register(){}

	public List<ProductData> find(ProductData product){
		List<ProductData> result = new ArrayList<>();
		List<DataTransferObject> list = per.find(product);

		for (DataTransferObject dto : list) {
			result.add((ProductData) dto);
		}
		return result;
	}



	/** === USERS ===
	 * This part of the facade handles construction of ghost users
	**/
	private static HashMap<String, User> users = new HashMap<String, User>();
	static { //Add, remove, or edit Users for the system here
		new User("Test", "Test");
		new User("Admin01", "Test");
		new User("Kund1@gmail.com", "Test");
		new User("Kund2@gmail.com", "Test");
		new User("Desig11", "Test");
		new User("Desig12", "Test");
	}
	
	/**
	 * This method is for registering users in the data facade, it is called every time a user object is initiated.
	 * 
	 * @param user a user object that wants to be registered in the data facade.
	 */
	public static void register(User user) {
		users.put(user.username, user);

	}
	
	/**
	 * This method is used to fetch users in the data facade.
	 * 
	 * @param username	the username of a specifc user.
	 * @return 			returns a user object identifed from the username inserted, if the user dosn't exist null is returned.
	 */
	public static User getUser(String username){return users.get(username);}
	
	/** === ACTIVITY ===
	 * This part of the facade handles construction of ghost activities
	**/
	private static HashMap<User, List<Activity>> activitites = new HashMap<User, List<Activity>>();
	static { //Add, remove, or edit Users for the system here
		Random rand = new Random();
		for(int i = 0; i < 18; i++)
			new Activity("Test", RandomHelper.randDate(), RandomHelper.randWords(rand.nextInt(20)+5), RandomHelper.randWords(rand.nextInt(20)+5));
		
	}
	
	/**
	 * 
	 * 
	 * 
	 * @param user
	 * @param activity
	 */
	public static void register(User user, Activity activity) {
		if(!activitites.containsKey(user))
			activitites.put(user, new ArrayList<Activity>());
		List<Activity> list = activitites.get(user);
		list.add(activity);
	}
	/**
	 * 
	 * 
	 * 
	 * @param user
	 * @return
	 */
	public static List<Activity> getActivity(User user){
		return activitites.get(user);
	}
	
}
