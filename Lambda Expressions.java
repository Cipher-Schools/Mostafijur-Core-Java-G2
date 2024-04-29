/*package whatever //do not write package name here */

import java.io.*;

//functional interface
interface int1{
    //void show1();
    
    int show2(int num);
}

/*
1. Subclass implements the interface
2. Create a anonymous class
3. With the help of lambda expressions
*/

class GFG {
	public static void main (String[] args) {
	    
	    //lambda expression
	    /*
	    int1 ref = () -> System.out.println("Inside show method");
	    ref.show();
	    */
	    
	    int1 ref2 = (int num) -> {
	        num += 1;
	        return num;
	    };
	    
	    System.out.println(ref2.show2(5));
	    
	    
		
	}
}