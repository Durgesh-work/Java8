package java_practice.java8;

import java.util.Arrays;

/*16)Find the sum and average of all elements in an integer array
Write a Java 8 program to find the sum and average of all elements in an integer array.*/
public class Question16 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		double avg = Arrays.stream(arr).average().getAsDouble();
		System.out.println(avg);

	}

}
