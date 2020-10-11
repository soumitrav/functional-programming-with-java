package streams.reduce;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReducerFunctionality {

	public static void main(String []args) {
		String result = Stream.of("Soumitra","Pathak","Kumar")
		.reduce("", (a,b) -> a+" "+b);
		System.out.println(result);
		
		int asInt = IntStream.range(1, 10).reduce((a,b) -> a+b).getAsInt();
		System.out.println(asInt);
		
		double res = DoubleStream.of(1,2,3).reduce(1, (a,b) -> a*b);
		
		System.out.println(result);
		
		IntPredicate isPrime = (n) -> {
			int i = 2;
			while(i < n) {
				 if (n % i == 0) { 
					 return false;
				 }
				 i++;
			}
			return true;
		};
		
		IntConsumer printNum = (n) -> System.out.println("prime no is "+ n);
		
		int sumOfPrime = IntStream.range(1, 10).filter(isPrime).
				peek(printNum)
				.reduce(0,(a,b) -> a+b);
		
		//IntStream.range(1, 10).filter(isPrime).forEach(System.out :: println);
		
		System.out.println(sumOfPrime);
		
	}
}
