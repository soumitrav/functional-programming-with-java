package lambda.optional;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MoreOperations {

	static Consumer<String> logger = (s) -> System.out.println("Logging "+s);
	
	public static void main(String[] args) {

		//ifPresent
		
		Optional<String> optional = Optional.of("Value");
		//optional.ifPresent(val -> System.out.println("This is a "+ val));
		optional.ifPresent(logger);
		
		//ifPresentOrElse
		
		//Optional.empty()
		//.ifPresentOrElse(System.out :: println, () -> System.out.println("Value is absent"));
		
		Optional.empty().ifPresentOrElse((s) -> System.out.println(s), 
				() -> logger.accept("Absent Value"));
		//stream
		
		Stream<String> stream = optional.stream();
		
		Optional.empty().stream()
		.forEach(System.out :: println);
		
		//or
		
		optional.or(() -> Optional.of("New Value"))
		.ifPresent(System.out :: println);
		
		
		Optional.empty()
		.or(() -> Optional.of("New Value"))
		.ifPresent(System.out :: println);
		//Optional.empty().or(() -> null).ifPresent(System.out :: println);
		
		//equals
		
		//optional
		//either both are empty
		//or if the values in optionals are equal to each other via equals method
		
		
		System.out.println(optional.equals(Optional.of("Value")));
		
		//hashcode
		
		System.out.println(Optional.empty().hashCode());
		
	}

}
