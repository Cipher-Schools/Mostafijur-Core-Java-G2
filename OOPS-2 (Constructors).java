/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    int a;
    int b;
    
    //default constructor
    GFG(){
      System.out.println("Inside constructor");  
    }
    //parameterised constructor
    GFG(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    //copy constructor
    GFG(GFG obj){
        
        this.a = obj.a;
        this.b = obj.b;
        
    }
    
    public void f(float num1, float num2){
        System.out.println("Inside float method");
        System.out.println(num1+num2);
    }
    
    public void f(double num1, double num2){
        System.out.println("Inside double method");
        System.out.println(num1+num2);
    }
    
    
    
	public static void main (String[] args) {
	    
	    //XYZ()
	    //GFG obj = new GFG();
	    GFG obj = new GFG(5,6);
	    //GFG objCopy = new GFG(obj);
	    GFG objCopy = obj;
	    
	   //obj.f((float)1.5, (float)2.5);
		System.out.println(objCopy.a + " " + objCopy.b);
		// System.out.println(obj2.a + " " + obj2.b);
	}
}