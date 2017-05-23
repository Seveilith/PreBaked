package grupp6.svp.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import grupp6.svp.domain.Activity;
import grupp6.svp.domain.DomainFacade;
/**
 * 
 * 
 * @author joncr49
 *
 */
public class PageFactory {
	
	/**
	 * 
	 */
	private static PageFactory instance = null;
	
	/**
	 * 
	 * @return
	 */
	public static PageFactory instance(){
		if(instance == null)
			instance = new PageFactory();
		return instance;
	}
	
	/**
	 * Method that handles communication between Servlets and "WebFacade".
	 * It helps us abstract away the web interface to the user and focus 
	 * on the response and in parameters. Creates a state of; 
	 * "We have these parameters (ex. variables)... Now we need to do this
	 * (ex. test login)... And responde with this (ex. send the user to a 
	 * welcome page)!" :)
	 * 
	 * @param response
	 * @param page
//	 * @param parameters
	 */
	public void answer(HttpServletRequest request, HttpServletResponse response, EnumPage page){
		//If something go wrong we need to catch it before the thread crashes...
		try{
			switch(page){
			case HOME:
				response.sendRedirect("index.jsp");
				break;
			case LOGIN:
				String username = request.getParameter("username");
			    String password = request.getParameter("password");
			    login(request, response, username, password);
				break;
			case LOGOUT:
				HttpSession session = request.getSession();
				DomainFacade.logout(session);
				this.answer(request, response, EnumPage.HOME);
				break;
			case USER_HOME:
				user(request, response);
				break;
			default:
				break;
			}
		} catch (Exception ex){
			ex.printStackTrace();
		}
	}

	/**
	 * 
	 * 
	 * @param request 
	 * @param response
	 * @param username
	 * @param password
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void login(HttpServletRequest request, HttpServletResponse response, String username, String password) throws IOException, ServletException {
		HttpSession session = request.getSession();
        String u = (String) session.getAttribute("Username");
		
		if(u == null && !DomainFacade.canLogin(username, password)){
			response.sendRedirect("login_failed.jsp"); //Username & password are incorrect we respond with a redirect to login_failed.jsp
			return;
		} else if (u == null) {
	        session.setAttribute("Username", username);
		}

		if(username.indexOf('@') >= 0){
			response.sendRedirect("customer.jsp");
		}else if(username.charAt(5) == '0'){
			response.sendRedirect("admin.jsp");
		}else if(username.charAt(5) == '1'){
			response.sendRedirect("designer.jsp");
		}
		response.sendRedirect("index.jsp");
	}
	
	
	/**
	 * 
	 * 
	 * 
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void user(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("Username");
		if(username == null){
			response.sendRedirect("login_failed.jsp"); //Some is trying to access a login restricted page without begin logged in, we redirect to login_failed.jsp
			return;
		}
		List<Activity> list = DomainFacade.getActivitites(username);

		response.setContentType("text/html"); //Divider between Logic & Page Building
		
		PrintWriter output = response.getWriter();
		ElementBuilder.addHead(output, "Title - You are logged in!");
		ElementBuilder.addHeader(request, response);
		
		output.append("<div class=\"mainContainer\">");
		
		//ADD CONTENT HERE! :) Sample page;
		ElementBuilder.addLeftPanel(output, ElementBuilder.getMenu());
		
		Table table = new Table();
		table.addHeader("Date", "Activity", "Notes");
		if(list != null){
			for(Activity activity : list)
				table.addRow(activity.date, activity.event, activity.comment);
		} else {
			table.addRow("N/A", "N/A", "N/A");
		}
		ElementBuilder.addCenterPanel(output, "<h1>Activities for " + username + "!</h1>" + table.tabulate());
		
		output.append("</div>");
		
		ElementBuilder.addFooter(request, response);
		ElementBuilder.addEnd(output);


	}

}
















