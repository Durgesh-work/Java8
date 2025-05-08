package java_practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*9)Merge two unsorted arrays into a single sorted array using Java 8 streams
Write a Java 8 program to merge two unsorted arrays into a single sorted array using the stream API.*/

public class Question9 {

	public static void main(String[] args) {
		
		int[] arr1 = {1,4,2,3,6,7};
		int[] arr2 = {9,8,5,6,3,2,1};
		
	 int[] arr3 = 	IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
	 
	 System.out.println(Arrays.toString(arr3));
	 
	 //------------------------------------------
	  String[] str1 = {"Durgesh","Santosh"};
	  String[] str2 = {"Dipali","Surekha"};
	  
	  String[] str3 = Stream.concat(Arrays.stream(str1), Arrays.stream(str2)).sorted().toArray(String[]::new);
	  System.out.println(Arrays.toString(str3));
	  
	}

}
