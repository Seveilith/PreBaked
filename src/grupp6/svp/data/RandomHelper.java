package grupp6.svp.data;

import java.util.GregorianCalendar;

public class RandomHelper {
	
	
	public static String randDate(){
		GregorianCalendar gc = new GregorianCalendar();

        int year = randBetween(1900, 2010);
        gc.set(gc.YEAR, year);
        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
        gc.set(gc.DAY_OF_YEAR, dayOfYear);
        
        return gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH);
	}
	
	public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
	
	public static String randWords(int count){
		String r = "";
	    for(int i = 0; i < count; i++) {
	        r += (char)(Math.random() * 26 + 97);
	    }
	    return r;
	}
	
}
