package java_practice.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	
	public static void main(String[] args) {
		String[] str = {"hello", "world"};
		
		   Arrays.stream(str)
           .map(s -> Stream.of(s.split(""))  // Split into array of characters
                           .sorted((a, b) -> -1) // Reverse order
                           .collect(Collectors.joining(""))) // Join back into a string
           .forEach(System.out::println); // Print the result
	}
}
