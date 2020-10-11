package designpatter.decorator;

public class DecoratorPattern {

	public static void main(String[] args) {
		Burger b = new BurgerShop((burger) -> burger.addCheese())
				.use(new BurgerShop((burger) -> burger.addVeggies()).use(new Burger()));
		System.out.println(b.toString());
	}
}
