package designpatter.decorator;

import java.util.function.Function;

public class BurgerShop {

	Function<Burger, Burger> decorator;
	
	public BurgerShop(Function<Burger, Burger> decorator) {
		this.decorator = decorator;
	}
	
	public Burger use(Burger b) {
		return decorator.apply(b);
	}
}
