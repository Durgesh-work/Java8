package java_practice.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

/*4)Find the frequency of each element in an array or a list
Write a Java 8 program to find the frequency of each element in an array or a list using streams and collectors.
*/
public class Question4 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("hello", "banana", "wolf","banana", "hello");

		Map<String, Long> frequencyMap = list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(), // Key: The element itself
                        LinkedHashMap::new,  // Use LinkedHashMap to maintain order
                        Collectors.counting() // Count occurrences
                ));
		
		frequencyMap.forEach(
				(key,value) -> System.out.println(key + " : " + value)
				);
	}

}
