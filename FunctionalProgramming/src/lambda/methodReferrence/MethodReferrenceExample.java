package lambda.methodReferrence;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferrenceExample {

	
	/** Method referrence 
		1.  Object referrnce
			object :: instanceMethod
		2. Class :: staticMethod
		2. Class :: instaceMethod
	*/
	public static void main(String []args) {
		Consumer<Integer> consumer =  A_Class :: add;
		consumer.accept(100);
		
		// Class :: staticMethod
		BinaryOperator<String> appendString = A_Class :: appendString;
		String result = appendString.apply("Soumitra", "Pathak");
		System.out.println(result);
		
		Function<String, Integer> length = String :: length;
		System.out.println(length.apply("Soumitra"));
		
		List.of("aB","bCD","cDEF").stream().map(String :: length).forEach(System.out :: println);
		
		// object :: instanceMethod
		BiFunction<Integer, Integer, Integer> add = new A_Class() :: addNumber;
		System.out.println(add.apply(100, 200));
		
	}
}

class A_Class{
	
	public static void add(int a) {
		System.out.println("a :"+a);
	}
	
	public static String appendString(String a, String b) {
		return a+b;
	}
	
	public Integer addNumber(int a, int b) {
		return a+b;
	}
	
	public String getClassName() {
		return this.getClassName();
	}
}
