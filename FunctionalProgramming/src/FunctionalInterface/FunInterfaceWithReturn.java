package FunctionalInterface;

public class FunInterfaceWithReturn {

	static StringLen len = str -> str+" "+str.length();
	
	public static void main(String [] args) {
		System.out.println(len.stringOp("Soumitra"));
	}
}

// Mentioning functional Interface annotation is optional
@FunctionalInterface
interface StringLen{
	String stringOp(String s);
}