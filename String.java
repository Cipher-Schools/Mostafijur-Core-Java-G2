/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		String s1 = "abc";
		//String s2 = "aBC";
		//s1 = s1 + "def";
		//s1 = s1.concat("def");
		//s1 = s1.concat(s2);
		//System.out.println(s1);
		//String s2 = new String("abc");
		
		//System.out.print(s1 + " " + s2);
		//System.out.print(s1);
		//System.out.println(s1.length());
	   //System.out.println(s1.contains("ca"));
		
		//System.out.print(s1);
		
	    //if(s1.equals("ABC"))
		//System.out.print("Equal");
		
	//	if(s1.equalsIgnoreCase(s2))
	//    System.out.print("Equal");
	   /*
	   char arr[] = s1.toCharArray();
	   
	   for(char c: arr){
	       System.out.println(c + " ");
	   }
	   */
	   
	   //String s3 = new String(arr);
	   //String s3 = String.valueOf(arr);
	   //System.out.println(s3);
	
	   
	   //System.out.print(s1.substring(1, 5));
	   
	   
	   for(int i=0; i<s1.length(); i++){
	       for(int j=i; j<s1.length(); j++){
	           
	          if((j-i+1)%2 == 0)
	          System.out.println(s1.substring(i,j+1));
	           /*
	           for(int k=i; k<=j; k++){
	             System.out.print(s1.charAt(k));
	           }*/
	           
	           //System.out.println();
	       }
	   }
	   
	}
}