/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		int n = 4;
		
		/*
		   1
		  21
		 321
		4321
		
		*/
		
		for(int i=1; i<=n; i++){
		    
		    //spaces
		    for(int j=1; j<=n-i; j++){
		        System.out.print(" ");
		    }
		    
		    //numbers
		    for(int j=i; j>=1; j--){
		        System.out.print(j);
		    }
		    
		    System.out.println();
		}
	}
}