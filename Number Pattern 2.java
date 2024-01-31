/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	
	 int n=4;
	 
	 /*
	    1
	   212
	  32123
	 4321234
	 
	 */
	 
	 for(int i=1; i<=n; i++){
	     
	     //spaces
	     for(int j=1; j<=n-i; j++)
	     System.out.print(" ");
	     
	     //numbers from i..1
	     for(int j=i; j>=1; j--)
	     System.out.print(j);
	     
	     //numbers from 2...i
	     for(int j=2; j<=i; j++)
	     System.out.print(j);
	     
	     System.out.println();
	 }
	 
	}
}