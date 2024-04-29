/*package whatever //do not write package name here */

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.Duration;


class GFG {
	public static void main (String[] args) {
		/*
		LocalDateTime d1 = LocalDateTime.now();
		
		System.out.println(d1);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-YYYY");
		System.out.println(f.format(d1));
		
		//immutable
		LocalDate d2 = LocalDate.parse("2022-03-03");
		System.out.println(d2);
		
		System.out.println(d2.isLeapYear());
		
		// isBefore d1.isAfter(d2)
		
		System.out.println(d1.getMonth());
		System.out.println(d1.getMonthValue());
	    System.out.println(d1.getDayOfMonth());
	    System.out.println(d1.getDayOfWeek());
	    System.out.println(d2.lengthOfMonth());
	    
	    System.out.println(d1.getHour());
	    System.out.println(d1.getMinute());
	    System.out.println(d1.getSecond());
	    System.out.println(d1.getNano());
	    */
	    
	    LocalDate d1 = LocalDate.of(2022,03,03);
	    LocalDate d2 = LocalDate.of(2022,04,04);
	    
	    System.out.println(ChronoUnit.DAYS.between(d1,d2));
	    //System.out.println(Duration.between(d1,d2).toDays());
	}
}