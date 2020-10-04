package lambda.consumer;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String []args) {
		Consumer<String> insertDB = (s) -> {
			System.out.println("Insert "+s+ " into DB");
		};
		insertDB.accept("Soumitra");
		
		Set.of("1","2","3").forEach(insertDB);
		
	}
}
