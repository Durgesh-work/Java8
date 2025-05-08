package java_practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*15)Sort a list of strings according to the increasing order of their length
Write a Java 8 program to sort a given list of strings according to the increasing order of their length.
*/

public class Question15 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("agf","b","123");
		
		list.stream().sorted((a,b) -> a.length() - b.length()).collect(Collectors.toList()).forEach(System.out::println);

	}

}
