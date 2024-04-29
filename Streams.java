/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.stream.*;

class GFG {
	public static void main (String[] args) {
		
		List<Integer> L = Arrays.asList(1,2,3,4);
		
		int sum = L.stream().reduce(0, (ans, i) -> ans+i);
		
		System.out.println(sum);
		
		L.stream().map(x -> x*x).forEach(y -> System.out.println(y));

        List<Integer> S = L.stream().map(x -> x*x).filter(x -> x%2 == 0).collect(Collectors.toList());
        
        System.out.println(S);
        
        List<String> names = Arrays.asList("Ratul", "Prateek", "Tenzin", "Raushan");
        
        List<String> result = names.stream().filter(s -> s.startsWith("R")).collect(Collectors.toList());
        
        System.out.println(result);
	}
}