package chapt1;

import java.util.List;
import java.util.stream.Collectors;

import chapt1.util.Utils;

public class FP01FunctionalProgramming {

	public static void main(String []args) {
		List<Integer> numbers = List.of(1,2,3,5,6);
		numbers.stream().filter(Utils :: isOdd).collect(Collectors.toList()).forEach(System.out :: println);
	}
	
	public static void print(int num) {
		System.out.println(num);
	}
	
}
