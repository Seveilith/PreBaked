package grupp6.svp.data;

public class Activity {
	
	public final String username;
	public final String date;
	public final String event;
	public final String comment;
	
	public Activity(String username, String date, String event, String comment){
		this.username = username;
		this.date = date;
		this.event = event; 
		this.comment = comment;
		
		User user = DataFacade.getUser(username);
		if(user == null)
			throw new IllegalArgumentException("User couldn't be found!");
		
		DataFacade.register(user, this);
	}
}
