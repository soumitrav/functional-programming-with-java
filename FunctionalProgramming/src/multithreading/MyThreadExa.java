package multithreading;

public class MyThreadExa {

	public static void main(String []args) {
		Thread t = new Thread(() -> {System.out.println("Hello");});
		t.start();
	}
}
