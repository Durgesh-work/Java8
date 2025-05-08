package java_practice.java8;

/*13)Find the sum of all digits of a number in Java 8
Write a Java 8 program to find the sum of all digits of a given number.*/
public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123;
		
		int sum = String.valueOf(num).chars().map(Character:: getNumericValue).sum();
		System.out.println(sum);
	}

}
