/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    int a = 1;
    int b = 2;
    
    static int c = 3;
    
    public void setA(int a){
        this.a = a;
    }
    
    public static void setC(int c){
        GFG.c = c;
       // GFG.a = 12;
       // this.a = 12; 
    }
	public static void main (String[] args) {
	    
	    GFG obj = new GFG();
	    GFG obj2 = new GFG();
	    
	    //GFG.c = 6;
	    setC(6);
		System.out.println(GFG.c);
		
	//	System.out.println(obj2.a + " " + obj2.b);
	}
}