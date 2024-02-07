/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;
class GFG {
	public static void main (String[] args) {
	    
	 Scanner sc = new Scanner(System.in);
	 
	 int b[];
	 
	 int n = sc.nextInt();
	 {
	     
	 int arr[] = new int[n];
	 
	 for(int i=0; i<n; i++){
	     arr[i] = sc.nextInt();
	 }
	 
	 System.out.println(arr);
	 b = arr;
	 
	 }
	 
	 System.out.println(b[0]);
	 
	 
	 
	 /*

	 2d array declaration
	 
	 int n = sc.nextInt();
	 int m = sc.nextInt();
	 int arr[][] = new int[n][m];
	 
	 for(int i=0; i<n; i++){
	     
	     for(int j=0; j<m; j++)
	     arr[i][j] = sc.nextInt();
	 }
	 
	 for(int i=0; i<n; i++){
	     
	     for(int j=0; j<m; j++)
	     System.out.print(arr[i][j]+" ");
	     
	     System.out.println();
	 }
	 */
	 
	
	 
	 
	}
}