package grupp6.svp.domain;

import grupp6.svp.data.DataFacade;
import grupp6.svp.data.DataTransferObjects.DataTransferObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Activity extends DomainObject{
	
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

	@Override
	public DataTransferObject create(HttpServletResponse response, HttpServletRequest request) {
		return null;
	}

}
