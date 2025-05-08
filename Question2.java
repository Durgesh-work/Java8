package java_practice.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*2)Remove duplicate elements from a list using Java 8 streams
Write a Java 8 program to remove duplicate elements from a list using the stream API and lambda expressions.*/

public class Question2 {

	public static void main(String[] args) {
		
		/*solution1- without lambda
		 * List<Integer> list = Arrays.asList(1,1,2,2,3,4,5,6,7,8,4,9,10);
		 * 
		 * List<Integer> newList =
		 * list.stream().distinct().collect(Collectors.toList());
		 * 
		 * System.out.println(newList);
		 */
		
		List<Integer> list = Arrays.asList(1,1,2,2,3,4,5,6,7,8,4,9,10);
		
		Set<Integer> seen = new HashSet<>();
		List<Integer> newList = list.stream().filter(n -> seen.add(n)).collect(Collectors.toList());
		
	}

}
