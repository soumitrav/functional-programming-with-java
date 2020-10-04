package lambda.UnaryOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class UnaryOperatorExample {

	public static void main(String []args) {
		
		UnaryOperator<Integer> operator = (i) -> i*100;
		List<Integer> lists = List.of(1,2,3);
		List<Integer> list = map(lists,operator);
		System.out.println(list);
		
		// Lambda
		
		List<Integer> mappedInts = lists.parallelStream().map(operator).collect(Collectors.toList());
		System.out.println(mappedInts);
	}

	private static <T> List<T> map(List<T> lists, UnaryOperator<T> operator) {
		List<T> newList = new ArrayList<T>();
		for (T t : lists) {
			newList.add(operator.apply(t));
		}
		return newList;
	}
}
