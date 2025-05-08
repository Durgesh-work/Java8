package java_practice.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*1)Separate odd and even numbers in a list of integers
Given a list of integers, write a Java 8 program to separate the odd and even numbers into two separate lists.*/
public class Question1 {
	public static void main(String[] args) {
		/*
		 * solution-1 List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 * 
		 * List<Integer> evenList = list.stream().filter(i -> i % 2 ==
		 * 0).collect(Collectors.toList());
		 * 
		 * evenList.forEach(System.out::print);
		 * 
		 * List <Integer> oddList = list.stream().filter(i -> i%2 !=
		 * 0).collect(Collectors.toList()); System.out.println();
		 * 
		 * oddList.forEach(System.out::print);
		 */

		/*
		 * solution-2 List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 * 
		 * Map<Boolean, List<Integer>> partitioned =
		 * list.stream().collect(Collectors.partitioningBy(i -> i%2 == 0));
		 * 
		 * List<Integer> evenList = partitioned.get(true); List<Integer> oddList =
		 * partitioned.get(false);
		 * 
		 * System.out.println(evenList); System.out.println(oddList);
		 */

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Map<String, List<Integer>> groupedList = list.stream()
				.collect(Collectors.groupingBy(n -> (n % 2 == 0) ? "even" : "odd"));

		List<Integer> evenList = groupedList.get("even");
		List<Integer> oddList = groupedList.get("odd");

		System.out.println(evenList);
		System.out.println(oddList);

	}

}
