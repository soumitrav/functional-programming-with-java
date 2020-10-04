package lambda.supplier;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String []args) {
		Supplier<List<String>> names = () -> List.of("A","B","C");
		names.get().forEach((s) -> System.out.println(s));
		
		Supplier<Double> doubleSupplier = () -> Math.random();
		System.out.println(doubleSupplier.get());
	}
}
