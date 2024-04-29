/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Person implements Comparable<Person>{
    
    String name;
    Integer age;
    
    Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    
    @Override
    public int compareTo(Person p){
        return this.age - p.age;
    }
}
class GFG {
	public static void main (String[] args) {
		
		var L = new ArrayList<Person>();
		L.add(new Person("rahul", 15));
		L.add(new Person("Ratul", 20));
		L.add(new Person("Anurag", 16));
		L.add(new Person("Anu", 17));
		
		Collections.sort(L);
		
		for(Person p: L){
		    System.out.println(p.name + " " + p.age);
		}
		
	}
}