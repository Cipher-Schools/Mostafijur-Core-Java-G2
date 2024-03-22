/*package whatever //do not write package name here */

import java.io.*;

//marker interface
interface in3{
    
    int p = 5;
}
interface in1{
    
    //public, static, final
    int a = 1;
    // public and abstract
    
    default void show1(){
        System.out.println(a);
    }
}

interface in2 extends in1{
    
    int b = 2;
    // public and abstract
    
    void show2();
    
    //void show(int num);
}

class test implements in2{
    
    /*
    public void setA(int a){
        this.a = a;
    }
    */
    
    /*
     void show1(){
        System.out.println(a);
    }*/
    
    public void show2(){
        System.out.println(b);
    }
    /*
    public void show(int num){
        System.out.println(num);
    }*/
    
}

class GFG {
	public static void main (String[] args) {
		
		test obj = new test();
		//obj.setA(5);
		obj.show1();
		obj.show2();
	}
}