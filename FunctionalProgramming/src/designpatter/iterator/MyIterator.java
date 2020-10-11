package designpatter.iterator;

public class MyIterator {
	public static void main(String []args) {
		MyArrayList list = new MyArrayList(new Object[] {1,2,3,4,5,"Soumitra"});
		//list.forEach((object) -> System.out.print(" "+object+" "));
		
		list.forEach((object) -> {
			//System.out.println("Inserting into DB");
			System.out.println("printing "+object);
		});
	}
}
