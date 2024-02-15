/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    
	    StringBuilder str = new StringBuilder("ABCD");
	    str.append("abc"); //ABCDabc
	    
	    //System.out.println("Content is :" + str);
	    //StringBuilder str2 = new StringBuilder(10);
	    //System.out.println(str2.capacity());
	    
	    //System.out.println(str.charAt(2));
	    
	    //str.delete(2,5);
	    //System.out.println(str);
	    //str.deleteCharAt(2);
	    //System.out.println(str);
	    //System.out.println(str.length());
	    
	    /*
	    char arr[] = new char[str.length()];
	    str.getChars(4,7, arr, 4);
	    
	    System.out.println(str);
	    
	    for(int i=0; i<7; i++)
	    System.out.println(arr[i]);
	    */
	    
	    str.setCharAt(3, 'E');
	    System.out.println(str);
	    
	    System.out.println(str.substring(0,4));
	    System.out.println(str.reverse());
		
	}
}