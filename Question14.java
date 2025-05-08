package java_practice.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*14)Find the second largest number in an integer array
Write a Java 8 program to find the second largest number in an integer array.*/
public class Question14 {

	public static void main(String[] args) {
		int[] arr = {2,9,5,8,6};
		
		int ans = Arrays.stream(arr).distinct().boxed().sorted((a,b) -> b-a).skip(1).findFirst().get();
		System.out.println(ans);
		
	}
}
