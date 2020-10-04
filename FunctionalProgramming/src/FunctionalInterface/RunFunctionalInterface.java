package FunctionalInterface;

public class RunFunctionalInterface {
	public static void main(String []args) {
		MyFunctionalInterface fun = () -> {System.out.println("This is first Functional Interface");};
		fun.myMethod();
		printAnything(() -> {System.out.println("This is fun print");});
		MyFunInterfaceWithParam fun2 = (i) -> System.out.println("Number is "+i);
		fun2.myMeth(100);
	}

	public static void printAnything(MyFunctionalInterface fun) {
		fun.myMethod();
	}
}
