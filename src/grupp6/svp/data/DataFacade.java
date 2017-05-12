package grupp6.svp.data;

import grupp6.svp.data.DataTransferObjects.*;
import grupp6.svp.domain.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import grupp6.svp.data.Persistence.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;

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

	private static DataFacade instance = null;

	/**
	 *
	 * @return
	 */
	public static DataFacade instance(){

		if(instance == null)
			instance = new DataFacade();
		instance.register();
		return instance;
	}

	protected PFacade per;

	public void register(){
		per = new PFacade();
		per.register(AdminData.class, new AdminBroker());
		per.register(BasketData.class, new BasketBroker());
		per.register(BasketProductsData.class, new BasketProductsBroker());
		per.register(CustomerData.class, new CustomerBroker());
		per.register(DesignerData.class, new DesignerBroker());
		per.register(DesignerOrderData.class, new DesignerOrdersBroker());
		per.register(OrderData.class, new OrderBroker());
		per.register(OrderedProductData.class, new OrderedProductBroker());
		per.register(ProductData.class, new ProductBroker());
	}

	public void answer(HttpServletResponse response, HttpServletRequest request){
		ProductData data = new ProductData(Integer.parseInt(request.getParameter("id")));

		if (request.getParameter("operation").equals("delete")){
			//delete(data);
		}

		if (request.getParameter("operation").equals("find")){
			//find(data);
		}

		if (request.getParameter("operation").equals("insert")){
			//insert(data);
		}
    }

	public List<DataTransferObject> find(DataTransferObject dto){

        List<DataTransferObject> result = per.find(dto);

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
