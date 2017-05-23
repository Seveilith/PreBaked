package grupp6.svp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * PageBuilder is a class that help us build certain webpage elements.
 * 
 * @author joncr49
 *
 */
public class ElementBuilder {
	
	
	/** CONTAINERS **/
	public static void addHead(PrintWriter output, String title) {
		output.append("<html>");
		output.append("<head>");
		output.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">");
		output.append("<title>" + title + "</title>");
		output.append("<link rel='stylesheet' type='text/css' href='./files/css/style.css'>");
		output.append("</head>");
		output.append("<body>");
	}
	
	public static void addHeader(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/header.jsp").include(request, response);
	}
	
	public static void addLeftPanel(PrintWriter output, String content) {
		output.append("<div class=\"leftPanel\">");
		output.append(content);
		output.append("</div>");
	}

	public static void addCenterPanel(PrintWriter output, String content) {
		output.append("<div class=\"centerPanel\">");
		output.append(content);
		output.append("</div>");
	}
	
	public static void addFooter(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/footer.jsp").include(request, response);
	}

	public static void addDeleteMsg(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter output = response.getWriter();
		response.setContentType("text/html");

		output.println("<div class=\"deletemsg\">");
		output.println("<p> Deleted row</p>");
		output.println("</div>");

		System.out.println("I ADD DELETE");
	}
	
	public static void addEnd(PrintWriter output) {
		output.append("</body>");
		output.append("</html>");
	}
	
	/** CONTENT **/
	public static String getMenu(){
		String menu = "<div class=\"menu\">";
		menu += "<p><a href='login'>Home</a><br></p>";
		menu += "<p><a href='user'>User Home</a><br></p>";
		menu += "<p><a href='logout'>Logout</a></p>"; //"Logout"
		
		menu += "</div>";
		return menu;
	}


	/**
	 * Just to fill out large areas where text is relevant but your fantasy have run dry.
	 * For more life saving context visit http://www.lipsum.com/
	 * 
	 * @return a string of random latin words...
	 */
	public static String getRandomLatin() {
		String latin = "";
		
		latin += "<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sed euismod nunc, sit amet suscipit orci. Nam at enim tincidunt, consectetur dui sed, molestie risus. Sed et nisi in velit aliquet posuere. Nulla facilisi. Vivamus suscipit vehicula purus vitae ullamcorper. Aliquam erat volutpat. Vestibulum pharetra, nulla eget luctus facilisis, dolor odio pretium nisi, id suscipit magna magna at tortor.</p>";

		latin += "<p>Proin rutrum lectus nec rutrum scelerisque. Suspendisse potenti. Sed egestas mi et elit eleifend dignissim. Curabitur nec commodo erat. Integer ullamcorper, purus quis euismod faucibus, lacus mauris facilisis velit, et congue justo augue non neque. Phasellus laoreet dignissim velit in dapibus. Vestibulum vel sodales lacus. Aenean facilisis pellentesque libero ac vulputate</p>";
		
		latin += "<p>Ut sit amet magna aliquet, vestibulum lorem sit amet, ullamcorper orci. Donec convallis aliquet orci, nec ullamcorper lectus egestas vel. Cras imperdiet odio a purus luctus, nec efficitur nulla elementum. Nunc vitae facilisis metus. Vestibulum iaculis eget nisl quis tempus. Nullam aliquam et ligula ac suscipit. Nullam quis aliquet eros, vel tristique diam. Quisque sed sem non ex tincidunt gravida. Donec non nisl sit amet neque molestie porttitor non ac metus. Integer non faucibus dui. Praesent libero arcu, vulputate quis est vel, elementum consequat leo. Donec consectetur tincidunt libero in accumsan.</p>";
		
		latin += "<p>Quisque fringilla, risus quis volutpat pharetra, purus diam suscipit erat, sit amet consequat nisi augue eget leo. Sed dictum risus purus, vitae vulputate turpis congue eget.</p>";
		
		return latin;
	}
	
}