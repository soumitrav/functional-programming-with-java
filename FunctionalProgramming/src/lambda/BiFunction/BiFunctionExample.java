package lambda.BiFunction;

import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String []args) {
		BiFunction<String, String, Integer> biFun = (a,b) -> (a+b).length();
		System.out.println(biFun.apply("Soumitra", "S"));
		
	}
}
