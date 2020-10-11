package lambda.currying;

import java.util.function.Function;

public class CurryingExample {

	public static void main(String []args) {
		Function<Integer, Function<Integer, Function<Integer, Integer>>> fun1 = u -> v -> w-> u+v+w;
		
		Function<Integer, Function<Integer, Integer>> fun2 = fun1.apply(100);
		Function<Integer, Integer> fun3 = fun2.apply(200);
	
		System.out.println("Result is "+fun3.apply(300));
	}
}
