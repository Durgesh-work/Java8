package java_practice.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

/*10)Merge two unsorted arrays into a single sorted array without duplicates
Write a Java 8 program to merge two unsorted arrays into a single sorted array without duplicates.*/
public class Question10 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,5,3,4,9,7};
		int[] arr2 = {3,2,8,5,4};
		
		int[] arr3 = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).distinct().sorted().toArray();
		System.out.println(Arrays.toString(arr3));
	}

}
