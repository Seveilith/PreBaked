package grupp6.svp.data;

import grupp6.svp.domain.Activity;
import grupp6.svp.domain.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/** 
*	=== DATA FACADE === 
*	A.k.a. Ghost Facade
*
*	Mimics the reactions of a database. It is like an actor,
*	playing to be something, while not being it. Helps us develop
*	products without having to have everything finished.
*	
*	== DATA OBJECTS ==
*	As the data facade is a ghost it holds "ghost objects", to ease development;
*		- every ghost object must be unique.
*		- every ghost object must be self installing into the interface 
*			(Call a register function in their constructor. The User class is a good example.). 
*		- every ghost object must have useful values
*		- every ghost object is assumed to hold correct data
*
*
*	P.S. This code is just made to work and is therefore prone to bugs, chaos and crashes. :)
*		 Bug fixing and changes to data is encouraged!
*
*	== SECTIONS ==
*	To ease development this class is divided into sections. Each sections handles one kind of ghost object.
*	These are the following sections that exists;
*
*	- Users: Handles any information about users...
*
*
**/
public class DataFacade {
	
	/** === USERS ===
	 * This part of the facade handles construction of ghost users
	**/
	private static HashMap<String, User> users = new HashMap<String, User>();
	static { //Add, remove, or edit Users for the system here
		new User("Test", "Test");
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
	public static User getUser(String username){
		return users.get(username);
	}
	
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
