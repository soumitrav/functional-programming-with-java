package lambda.function;

import java.util.List;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String []args) {
		Function<String, Integer> function = (s) -> s.length();
		List.of("Soum","Mitra","ABC").stream().
				map(function).
				forEach((s) -> System.out.println(s));
	}
}
