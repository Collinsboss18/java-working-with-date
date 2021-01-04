package date_time;

import java.util.Date;
import java.text.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo {

	public static void main(String[] args) {
		//
		Date date = new Date();
		System.out.println("Date " + date);
		System.out.println("Date to string " + date.toString());
		
		System.out.println("Time " + date.getTime());
		System.out.println("Month " + date.getMonth()+1);
		System.out.println(date.getYear()+1900);
		System.out.println("Day " + date.getDay());
		
		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/d HH:mm:ss");
		System.out.println(sdf.format(date));
		
		
		// More Formats
		LocalDateTime myDateObj = LocalDateTime.now();
	    System.out.println("Before formatting: " + myDateObj);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	    
	    /** 
	     * TODO Other partterns 
	     * Value	Example	
	     * yyyy-MM-dd	"1988-09-29"	
	     * dd/MM/yyyy	"29/09/1988"	
	     * dd-MMM-yyyy	"29-Sep-1988"	
	     * E, MMM dd yyyy	"Thu, Sep 29 1988"
	     */
	    

	}

}
