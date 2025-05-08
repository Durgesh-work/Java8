package java_practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*12)Check if two strings are anagrams or not using Java 8 streams
Write a Java 8 program to check if two strings are anagrams or not using the stream API and lambda expressions.*/
public class Question12 {
	
	static boolean flag = true;
	
	public static boolean method(String str1, String str2) {
		return Arrays.stream(str1.split(""))
                .sorted()
                .collect(Collectors.joining())
                .equals(Arrays.stream(str2.split(""))
                              .sorted()
                              .collect(Collectors.joining()));
	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		/*solution1
		 * List<String> list = Arrays.asList("listen","silent");
		 * 
		 * Map<Character, Long> map = list.stream().flatMap(s -> s.chars().mapToObj(c->
		 * (char) c)).collect(Collectors.groupingBy(Function.identity(),
		 * Collectors.counting()));
		 * 
		 * 
		 * 
		 * map.forEach((key,value) -> { if(value % 2 != 0) { flag = false;
		 * 
		 * } });
		 * 
		 * if(flag == true) { System.out.println("strings are anagrams"); } else {
		 * System.out.println("strings are not anagrams"); }
		 */
		String str1 = "listen";
        String str2 = "silent";
        
        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + (method(str1,str2)));

		
		

	}

}
