package lambda.chainfunction;

import java.util.Objects;

public class ChainFunction {

	public static void main(String []args) {
	Consumer<String> c1 = (t) -> System.out.println("1"+t);
	Consumer<String> c2 = (t) -> System.out.println("2"+t);
	Consumer<String> c3 = (t) -> System.out.println("3"+t);
	
	Consumer<String> thenAccept = c1.thenAccept(c2).thenAccept(c3);
	thenAccept.accept("Soumitra");
	}
}

interface Consumer<T>{
	
	public void accept(T t);

	public default Consumer<T> thenAccept(Consumer<T> next) {
		Objects.requireNonNull(next);
		return (T t) ->{
			this.accept(t);
			next.accept(t);
		};
	}
}
