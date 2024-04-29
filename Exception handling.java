/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    public static void f(int a, int b, String s){
        System.out.println(a/b);
        System.out.print(s.charAt(0));
    }
    
	public static void main (String[] args) {
	    
	    int a = 5;
	    int b = -1;
	    
	    String s = null;
	    
	    try{
	    f(a,b,s);// can cause exception
		}  
		
		catch(ArithmeticException e){
		    e.printStackTrace();
		    System.out.println(e.getMessage());
		}
		
		catch(NullPointerException e){
		    e.printStackTrace();
		    System.out.println(e.getMessage());
		}
		
		
		/*
		try{
		System.out.println(s.length());// can cause exception
		}  
		
		catch(NullPointerException e){
		    e.printStackTrace();
		    System.out.println(e.getMessage());
		    
		}
		*/
		
		System.out.println(a);
		System.out.println(b);
	}
}