/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    
    public static List<Integer> f(List<? extends Number> nums){
        
        var integers = new ArrayList<Integer>();
        
        for(Number num : nums){
            
            if(num instanceof Integer){
                System.out.println(num.intValue());
                integers.add(num.intValue());
            }
        }
        
        return integers;
    }
	public static void main (String[] args) {
		
		var nums = new ArrayList<Number>();
		nums.add(1);
		nums.add(5.00);
		nums.add(2);
		nums.add(89);
		
		System.out.println(f(nums));
	}
}