package lambda.constructorReferrence;

import java.util.function.Function;

public class ConstructorReferrence {

	public static void main(String []args) {
		Function<Runnable, Thread> threadGenerator = Thread :: new;
		Thread t1 = threadGenerator.apply(() -> System.out.println("Thread 1"));
		t1.start();
		
		threadGenerator.apply(() -> System.out.println("Thread2 executing")).start();
		
		Runnable r1 = () -> System.out.println ("Thread 3 Executing");
		threadGenerator.apply(r1).start();
		
		Function<String, String> stringGen = String :: new;
		stringGen.apply("Soumitra");
		
		Function<String, TestClass> testClassGen = TestClass :: new;
		TestClass test = testClassGen.apply("Soumitra Test");
		System.out.println(test.test);
	}
}

class TestClass{
	String test;
	public TestClass(String a) {
		test = a;
	}
}