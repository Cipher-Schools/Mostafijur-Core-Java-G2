/*package whatever //do not write package name here */

import java.io.*;

interface in1{
    
    int a = 5;
    
    void show1();
    
    interface in2{
        
        int b = 6;
        
        void show2();
    }
}

class test implements in1, in1.in2{
    
    @Override
    public void show1(){
        System.out.println(a);
    }
    
    @Override
    public void show2(){
        System.out.println(b);
    }
    
}
class GFG {
	public static void main (String[] args) {
		
		test obj = new test();
		obj.show2();
		obj.show1();
	}
}