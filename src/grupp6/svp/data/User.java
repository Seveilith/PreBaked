package grupp6.svp.data;

/**
 * This class is a ghost class that represents a User in the system.
 * When the constructor is called (object is initiazed) it is 
 * automatically registered in the data facade.
 * 
 * Suggestion: Add methods that will help with handeling a user, 
 * such as; comparing input username and password with a user object.
 * 
 * @author joncr49
 *
 */
public class User {
	
	/**
	 * Variable for username.
	 * It is declared to be final so that it cannot be changed later on.
	 */
	public final String username;
	
	/**
	 * Variable for password.
	 * It is declared to be final so that it cannot be changed later on.
	 */
	public final String password;
	
	/**
	 * This is the constructor of the class, first it sets the values
	 * of the variables. Last, it registers the object to the data facade.
	 * 
	 * 
	 * @param username	username for the User to be registered in the data facade,
	 * 					it is also the unquie identifer in the database.
	 * @param password	password for the User to be registered in the data facade
	 */
	public User(String username, String password){
		this.username = username;
		this.password = password;
		
		DataFacade.register(this);
	}
	
	
}
