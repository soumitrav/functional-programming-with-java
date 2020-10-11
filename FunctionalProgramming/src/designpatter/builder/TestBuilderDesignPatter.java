package designpatter.builder;

public class TestBuilderDesignPatter {

	public static void main(String []args) {
		Mobile myMobile = new MobileBuilder().with((builder) ->{
			builder.battery = 4;
			builder.ram = 8;
			builder.screenSize = 6;
			builder.processor = "Intel i5";
		}).createMobile();
		
		System.out.println(myMobile);
	}
}
