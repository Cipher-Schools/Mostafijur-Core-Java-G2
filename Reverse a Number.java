/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	
	 int n = 54321;
	 int rev = 0;
	 
	 while(n > 0){
	     int dig = n%10;
	     rev *= 10;
	     rev += dig;
	     n /= 10;
	 }
	 
	 System.out.print(rev);
	}
}