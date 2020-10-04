package FunctionalInterface;

public class MathOperation {

	public static void main(String []args) {
		MathOp add = (a,b) -> {return a+b;};
		System.out.println(add.operation(100, 20));
		
		MathOp mul = (a,b) -> {return a*b;};
		System.out.println(mul.operation(100, 20));
	}
}

@FunctionalInterface
interface MathOp{
	public int operation(int a,int b);
}

