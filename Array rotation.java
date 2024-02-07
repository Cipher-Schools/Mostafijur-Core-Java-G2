/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		int d = 5;
		int arr[] = {1,4,5,6,7,9,2};
		int n = arr.length;
		
		int temp[] = new int[d];
		
		//store in temp array first d elements
		for(int i=0; i<d; i++){
		    temp[i] = arr[i];
		}
		
		//shift all n-d elements to left by d positons
		for(int i=d;i<n; i++){
		    arr[i-d] = arr[i];
		}
		
		//shift temp arr elements to last d positions
		for(int i=0;i<d; i++){
		    arr[n-d+i] = temp[i];
		}
		
		for(int i=0; i<n; i++){
		    System.out.print(arr[i] + " ");
		}
		
		
	}
}