package lambda.higherOrderFun;

import java.util.List;

public class HigherOrderFunctionExa {

	public static void main(String []args) {
		
		// Higher order function : takes function and return the values as function only.
		// product and Connfigure
		// product -> Laptop + USB ( List)
		//configure --> Append these two and return
		IFactory<String> laptopFactory = createFactory(() -> List.of("Laptop","USB"), (list) -> String.join("+", list));
		System.out.println(laptopFactory.create());
	}
	
	public static <T,R> IFactory<R>  createFactory(IProduct<T> product, 
			IConfigurator<T,R> configure ) {
		
		return () ->{
			T produce = product.produce();
			return configure.configure(produce);
		};
		
	}
}
