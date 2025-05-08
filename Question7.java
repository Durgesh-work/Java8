package java_practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*7)Print the numbers from a given list of integers that are multiples of 5
Write a Java 8 program to print the numbers from a given list of integers that are multiples of 5.*/

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1,4,3,8,6,5,10,13,12,70);
		
		List<Integer> newList = list.stream().filter(s-> s % 5 == 0).collect(Collectors.toList());
		
		System.out.println(newList);
	}

}
