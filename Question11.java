package java_practice.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*11)Get the three maximum and three minimum numbers from a given list of integers
Write a Java 8 program to get the three maximum and three minimum numbers from a given list of integers.*/

public class Question11 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,7,3,7,9,4,6,0);
		
		List<Integer> minNumbers = list.stream().sorted().limit(3).collect(Collectors.toList());
		System.out.println(minNumbers);
		
		list.stream().sorted(Collections.reverseOrder()).limit(3).collect(Collectors.toList()).forEach(System.out::println);
	}
}
