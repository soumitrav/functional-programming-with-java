package lambda.tailrecursion;

public class TailRecursion {

	public static void main(String []args) {
		
		System.out.println(fact(4));
		
		// Tail Recursion uses accumulator to collect the value and then it return
		System.out.println(tailFact(4, 1));
	}
	
	public static int tailFact( int n, int a) {
		if(n <=1)
		{
			System.out.println("n = "+n+" a "+a);
			return a;
		}
		else {
			System.out.println("n = "+n+" a "+a);
			return tailFact(n-1, n*a);
		}
	}
	
	public static int fact(int n) {
		if(n <=1)
			return 1;
		else
			System.out.println("n = "+n);
			return n*fact(n-1);
	}
}
