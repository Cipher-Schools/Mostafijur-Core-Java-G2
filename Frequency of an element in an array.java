/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		int arr[] = {3,2,2,3,3,2,4,3};
		int n = arr.length;
		int count = 0;
		int x = 3;
		
		
		for(int i=0; i<n; i++){
		    if(arr[i] == x)
		    count++;
		}
		
		System.out.println(count);
	}
}