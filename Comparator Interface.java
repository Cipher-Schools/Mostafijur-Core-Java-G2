/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.stream.*;

class GFG {
    
    public static List<Integer> f(List<? extends Number> nums){
        
        var integers = new ArrayList<Integer>();
        
        for(Number num : nums){
            
            if(num instanceof Integer){
                //System.out.println(num.intValue());
                integers.add(num.intValue());
            }
        }
        
        return integers;
    }
	public static void main (String[] args) {
		
		var nums = new ArrayList<Number>();
		nums.add(1); //1.00
		nums.add(5.00); // 5.00
		nums.add(2); // 2.00
		nums.add(89); // 89.00
		
		//i, i+1 --> xyz 
		Comparator<Number> comp = Comparator.comparingDouble(Number::doubleValue);
		//Collections.sort(nums,comp);
		
		List<Number> sortedArr = nums.stream().
		                         sorted(Comparator.comparingDouble(Number::doubleValue)).
		                         collect(Collectors.toList());
		
		System.out.println(sortedArr);
		// List<Number> --> sort 
		
		//System.out.println(f(nums));
	}
}