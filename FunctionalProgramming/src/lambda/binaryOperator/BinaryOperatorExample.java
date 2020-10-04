package lambda.binaryOperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	public static void main(String []args) {
		BinaryOperator<String> appendString = (a,b) -> a+","+b;
		System.out.println(appendString.apply("Soumitra", "Pathak"));
		
	}
}
