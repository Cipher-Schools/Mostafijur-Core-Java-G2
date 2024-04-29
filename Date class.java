/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		Date d1 = new Date();
		System.out.println(d1);
		
		//1st January, 1970 --> 00:00:00
		Date d2 = new Date(1000000L);
		System.out.println(d2);
		
		Date d3 = new Date(10567809090000L);
		System.out.println(d3);
		
		System.out.println(d3.after(d2));
		System.out.println(d3.before(d2));
		System.out.println(d3.equals(d2));
		
		System.out.println(d3.getTime());
		d3.setTime(1000009090900L);
		System.out.println(d3);
		
		
		
	}
}