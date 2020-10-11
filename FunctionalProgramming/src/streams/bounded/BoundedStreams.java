package streams.bounded;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class BoundedStreams {

	public static void main(String[] args) {
		//1. stream() on a Collection
		List<Integer> list = List.of(1,4,7,9,4);
		Stream<Integer> streamIntegers = list.stream();
		
		Optional<Integer> reduce = Set.of(1,2,3,4).stream().peek(System.out :: println).reduce((a,b)->a+b);
		
		System.out.println("Set Reduce "+reduce);
		
		
		//How we can stream a Map.
		Map<Integer,String> map = Map.of(1, "one", 2, "two", 3, "three", 4, "four");
		Stream<Entry<Integer, String>> entries = map.entrySet().stream();
		
		Stream<String> values = map.values().stream();
		Stream<Integer> keys = map.keySet().stream();
		
		//2. of() Stream class
		
		Stream<String> streamStrings = Stream.of("Hey! ","Happy", "Thanksgiving");
		
		//3. stream() of Arrays Class
		
		Integer[] integerArr = {3,5,7,89,9};
		Stream<Integer> stream = Arrays.stream(integerArr);
		
		int[] intArr = {3,5,7,89,9};
		IntStream stream2 = Arrays.stream(intArr);
		
		//4. builder() of Stream class.
		
		Builder<Integer> builder = Stream.builder();
		
		builder.add(1);
		
		//code
		
		//condition
		
		builder.add(4);
		
		builder.build();
		
		
		
		
		Builder<Integer> builder2 = Stream.builder();
		
		IntStream.range(1, 10).filter((n) -> n%2 == 0).
		forEach((n) -> builder2.add(n));
		
		int sum = builder2.build().mapToInt((n) -> n).sum();
		
		System.out.println(sum);
		
		
		
	}

}

