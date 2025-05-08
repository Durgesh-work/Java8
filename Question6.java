package java_practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*6)Join a list of strings with '[' as prefix, ']' as suffix, and ',' as delimiter
Given a list of strings, write a Java 8 program to join the strings with '[' as a prefix, ']' as a suffix, and ',' as a delimiter.
*/
public class Question6 {

	public static void main(String[] args) {
		
		/*solution1
		 * List<String> list = Arrays.asList("Wolf","durgesh");
		 * 
		 * String str = list.stream().map(s ->
		 * "["+s+"]").collect(Collectors.joining(","));
		 * 
		 * System.out.println(str);
		 */
		
		List<String> list = Arrays.asList("Wolf","durgesh");
		
		String str = list.stream().collect(Collectors.joining(",", "[", "]"));
		System.out.println(str);

	}

}
