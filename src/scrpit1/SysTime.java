package scrpit1;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
public class SysTime {
	
		   public static   String  main() {
		       //getting current date and time using Date class
		       DateFormat df = new SimpleDateFormat("MMM d, yyyy");
		       Date dateobj = new Date(0);
//		       System.out.println(df.format(dateobj));
		       String Time = df.format(dateobj);
//		       df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
//		       String IST = df.format(dateobj);
//		       System.out.println(IST);
		       return Time;
		   }
}
