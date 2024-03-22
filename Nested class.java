/*package whatever //do not write package name here */

import java.io.*;

class A{
    
    int a = 100;
    
    void show1(){
        System.out.println(a);
    }
    
    class B{
        
        int b = 99;
        
        void show(){
            //System.out.println(a);
            show1();
            System.out.println(b);
        }
    }
}

class C extends A{
    
    int c = 10;
    
    void show2(){
        System.out.println(c);
    }
    
    
}

class GFG {
	public static void main (String[] args) {
		
		C obj =  new C();
		
		C.B obj2 = obj.new B();
		obj2.show();
		//obj2.show1();
		//System.out.println(obj2.a);
	}
}