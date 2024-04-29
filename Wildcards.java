/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    /*
    public static void print(? variable){
        System.out.println(variable);
    }*/
    
    /*
    public static void print(List<? extends Number> coll){
        System.out.println(coll);
    }*/
    public static void print(List<? super Integer> coll){
        System.out.println(coll);
    }
	public static void main (String[] args) {
		
		//List<Integer> L = new ArrayList<>();
		/*
		var L = new ArrayList<Integer>();
		L.add(1);
		L.add(2);
		L.add(3);
		print(L);
        */
        
        List<Number> L = new ArrayList<Number>();
		L.add(1.0);
		L.add(2);
		L.add(3.0);
		print(L);
		
		/*
		var L = new ArrayList<String>();
		L.add("abcd");
		L.add("erfg");
		print(L);
		*/
		
		/*
		var num ;
		System.out.println(num);
		*/
	}
}