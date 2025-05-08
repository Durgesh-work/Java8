package java_practice.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*3)Find the frequency of each character in a string using Java 8 streams
Write a Java 8 program to find the frequency of each character in a given string using the stream API and collectors.*/
public class Question3 {
	public static void main(String[] args) {

		/*
		 * String str = "sderfdsvbhgyfds";
		 * 
		 * Map<Character, Integer> map = new HashMap<>();
		 * 
		 * for (int i = 0; i < str.length(); i++) { char c = str.charAt(i);
		 * 
		 * if (map.containsKey(c)) { map.replace(c, map.get(c), map.get(c) + 1); } else
		 * { map.put(c, 1); } }
		 * 
		 * for(Entry<Character, Integer> m: map.entrySet()) {
		 * System.out.println(m.getKey() + " : "+m.getValue()); }
		 */
		
		String input = "banana";

        // Count frequency of each character
        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequencyMap);
    }
}
