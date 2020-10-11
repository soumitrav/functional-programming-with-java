package lambda.closure;

public class ClosureExample {

	public static void main(String []args) {
		// Free vaiable in Lexicative context
		
		final int val = 110;
		
		Task doTask = ()->{
			System.out.println(val);
		};
		
		new AnotherClass().printMethod(doTask);
	}
}

class AnotherClass{
	
	public void printMethod(Task t) {
		t.doTask();
	}
}

interface Task{
	public void doTask();
}