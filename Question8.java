package java_practice.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*8)Find the maximum and minimum of a list of integers
Given a list of integers, write a Java 8 program to find the maximum and minimum numbers in the list.*/

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*solution1
		 * List<Integer> numbers = Arrays.asList(10, 45, 2, 99, 34, 67);
		 * 
		 * int maximum =
		 * numbers.stream().sorted(Collections.reverseOrder()).findFirst().get(); int
		 * minimum = numbers.stream().sorted().findFirst().get();
		 * System.out.println("Maximum : "+ maximum + "\nminimum : "+ minimum);
		 */
		
		List<Integer> numbers = Arrays.asList(10, 45, 2, 99, 34, 67);
		int max = numbers.stream().max(Integer::compareTo).get();
		int min = numbers.stream().min(Integer::compareTo).get();
		System.out.println("Maximum : "+ max + "\nminimum : "+ min);
		
	}

}
