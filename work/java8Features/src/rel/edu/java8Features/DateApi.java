package rel.edu.java8Features;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

/* DISADVANTAGE 
 * we have date API in sql,util
 * if we want to format the date format we need to import another package called text
 * all the classes used for formating the date is not tread safe
 * 
 * ADVANTAGES
 * 
 * Date class is immutable
 * import java.time separate package for date  api
 * */

public class DateApi {
	
	public static void main(String[] args) {
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalTime t = LocalTime.now(ZoneId.of("GMT"));
		System.out.println(t);
		
	}

}
