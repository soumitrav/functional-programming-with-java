package lambda.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PredicateExample {

	public static void main(String []args) {
		
		List<String> filterList = filterList(List.of("Soumitra", "Pathak", ""), (s) -> !s.isEmpty());
		
		Predicate<String> predicate = (s) -> !s.isEmpty();
		for (String val : filterList) {
			if(predicate.test(val)) {
				System.out.println(val);
			}
		}
		
		System.out.println(filterList);
		System.out.println(filterList(List.of(1, 2, 3),(i) -> i%2 == 0));
	}
	
	public static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
		return list.stream().filter(predicate).collect(Collectors.toList());
	}
}
