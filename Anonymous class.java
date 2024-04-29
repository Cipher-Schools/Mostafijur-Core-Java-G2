/*package whatever //do not write package name here */

import java.io.*;

interface int1{
    void show();
}

// Subclass that implements the interface

class GFG {
    
   // int a = 8;
    
	public static void main (String[] args) {
		
		int a = 7;
		//a += 10;
		
		//anonymous class
		int1 obj = new int1(){
		    
		    static final int b = 10;
		    
		    @Override
		    public void show(){
		        
		        System.out.println(a);
		    }
		};
		
		int1 obj2 = new int1(){
		    
		    @Override
		    public void show(){
		        
		        System.out.println("Inside show method");
		    }
		    
		};
		
		
		obj2.show();
		
	}
}