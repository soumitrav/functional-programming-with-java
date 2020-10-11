package designpatter.iterator;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MyArrayList extends ArrayList<Object> {
	Object [] arr;

	public MyArrayList(Object [] arr) {
		this.arr = arr;
	}

	public void forEach(Consumer<Object> consumer) {
		for (Object object : arr) {
			consumer.accept(object);
		}
	}
}
