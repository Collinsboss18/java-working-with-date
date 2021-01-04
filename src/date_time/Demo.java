package date_time;

import java.util.Date;
import java.text.*;

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

	}

}
