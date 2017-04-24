package grupp6.svp.web;

/**
 * This is a stupid helper class to easier build table in HTML... it does so with out any tests...
 * 
 * @author joncr49
 *
 */
public class Table {
	
	private int clms = 0;
	private String header = "";
	private String rows = "";
	
	/**
	 * 
	 * 
	 * @param headers
	 */
	public void addHeader(String... headers){
		clms = headers.length;
		
		String t = "";
		
		for(String str : headers)
			t += "<th>" + str + "</th>";
		
		header = "<tr>" + t + "</tr>";
		
		rows = "";
	}
	
	/**
	 * 
	 * 
	 * @param headers
	 */
	public void addRow(String... values){
		if(values.length != clms)
			throw new IllegalArgumentException("Row columns is not the same as table columns...");
		String t = "";
		
		for(String str : values)
			t += "<td>" + str + "</td>";
		
		rows += "<tr>" + t + "</tr>";
	}
	
	public String tabulate() {
		return "<table>" + header + rows + "</table>";
	}
}
