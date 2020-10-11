package lambda.composition;

public class MethodComposition {

	public static void main(String [] args) {
		Function<Square, Integer> fun1 = (s) -> s.getArea();
		Function<Integer, Double> fun2 = (s) -> Math.sqrt(s);
		
		Function<Square, Double> compose = fun2.compose(fun1);
		Double result = compose.apply(new Square(1000));
		
		System.out.println("Final Value "+result);
	}
}

interface Function<T,R>{
	public R apply(T t);
	
	default <V> Function<V,R> compose(Function<V,T> before) {
		
		return (V v) -> {
			return apply(before.apply(v));
		};
	}
	
}

class Square{
	
	int area;

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public Square(int area) {
		super();
		this.area = area;
	}
	
}
