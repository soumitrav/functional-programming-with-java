package generics;

public class MainFunctionalGenerics {

	public static void main(String []args) {
		
		FunctionalGenerics<String, String> fun1 = s -> s.substring(2);
		System.out.println(fun1.execute("Somitra"));
		
		FunctionalGenerics<String, Integer> fun2 = s -> s.length();
		System.out.println(fun2.execute("Soumitra"));
		
	}
}
