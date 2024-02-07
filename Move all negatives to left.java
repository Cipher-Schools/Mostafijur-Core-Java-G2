/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		int arr[] = {3,-2,2,-3,-3,-2,4,3};
		int n = arr.length;
		
		int i=0;
		int j=0;
		
		while(i<n && j<n){
		    
		    if(arr[i] < 0)
		    i++;
		    else if(j <= i || arr[j] >= 0)
		    j++;
		    else{
		        int temp = arr[i];
		        arr[i] = arr[j];
		        arr[j] = temp;
		    }
		}
		
		for(i=0; i<n; i++){
		    System.out.print(arr[i] + " ");
		}
	}
}