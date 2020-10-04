package lambda;

import java.util.stream.IntStream;

public class SumOfEven {

	public static void main(String []args) {
		int asInt = IntStream.rangeClosed(0, 100).
				filter((i) -> i%2 ==0).
				reduce((x,y) -> x+y).
				getAsInt();
		System.out.println(asInt);
	}
}
