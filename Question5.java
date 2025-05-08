package java_practice.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*5)Sort a given list of decimals in reverse order
Write a Java 8 program to sort a given list of decimal numbers in reverse order.*/
public class Question5 {

	public static void main(String[] args) {
		List<Float> floatList = Arrays.asList(0.5f, 1.1f, 2.2f, 3.3f, 4.4f, 0.1f);
		
		List<Float> newList = floatList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		 newList.forEach(System.out::println);

	}

}
