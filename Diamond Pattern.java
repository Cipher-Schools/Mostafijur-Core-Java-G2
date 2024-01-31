/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		int n = 4;
		
		/*
		
		  *
		 * *
		* * *
	   * * * *
	    * * *
	     * *
	      *
	   
		*/
		
		//part 1
		for(int i=1; i<=n; i++){
		    
		    //spaces
		    for(int j=1; j<=n-i; j++){
		        System.out.print(" ");
		    }
		    
		    //stars
		    for(int j=i; j>=1; j--){
		        System.out.print("* ");
		    }
		    
		    System.out.println();
		}
		
		//part 2
		for(int i=n-1; i>=1; i--){
		    
		    //spaces
		    for(int j=1; j<=n-i; j++){
		        System.out.print(" ");
		    }
		    
		    //stars
		    for(int j=i; j>=1; j--){
		        System.out.print("* ");
		    }
		    
		    System.out.println();
		}
	}
}