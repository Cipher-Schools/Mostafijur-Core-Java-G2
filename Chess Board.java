/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	
	 int n=3;
	 
	 /*
	    W B W
	    B W B
	    W B W
	 
	 */
	 
	 //rows
	 for(int i=1; i<=n; i++){
	     
	     //cols
	     for(int j=1; j<=n; j++){
	         
	         if((i+j)%2 == 0)
	         System.out.print("W ");
	         else
	         System.out.print("B ");
	         
	     }
	     
	     System.out.println();
	 }
	 
	}
}