package lambda.optional;

import java.util.Optional;

public class OptionalExample {

	public static void main(String []args) {
		String a = "Some";
		
		Optional<String> optionalval = Optional.of(a);
		Optional<Object> ofNullable = Optional.ofNullable(null);
		
		Optional<Integer> empty = Optional.empty();
		
		//java.util.NoSuchElementException: No value presen
		//Integer object = empty.get();
		
		Integer orElse = empty.orElse(0);
		System.out.println(orElse);
		
		Integer orElseGet = empty.orElseGet(() -> 0);
		System.out.println(orElseGet);
		
		System.out.println(empty.isEmpty());
		System.out.println(empty.isPresent());
		
		//empty.orElseThrow(() -> new RuntimeException());
		//empty.orElseThrow(); // Similar to get() throws noSuchElement
		
		
		// Map 
		
		Optional<String> val = Optional.of("value");
		String orElse2 = val.map((s) -> "Replaced").orElse("Empty");
		String orElse3 = empty.map((s) -> "Replaced").orElse("Empty");
		System.out.println(orElse2+" "+orElse3);
		
		
		//Filter
		
		String string = val.filter((s) -> s.equalsIgnoreCase("value")).get();
		//String string1 = val.filter((s) -> s.equalsIgnoreCase("value1")).get(); // java.util.NoSuchElementException: No value present
		System.out.println(string);
		
		//Flatmap
		Optional<String> flatMap = val.flatMap((s) -> Optional.of("Flatmap Replaced Value"));
		System.out.println(flatMap.get());
		
		Optional<String> emptyFlatMap = empty.flatMap((s) -> Optional.of("Flatmap Replaced Value"));
		System.out.println(emptyFlatMap.orElseGet(() -> "Empty Value"));
	}
}
