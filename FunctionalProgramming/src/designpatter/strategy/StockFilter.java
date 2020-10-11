package designpatter.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StockFilter {

	public static List<Stock> Filter(List<Stock> list, Predicate<Stock> predicate) {
		
		List<Stock> newList = new ArrayList<Stock>();
		for (Stock stock : list) {
			if(predicate.test(stock)) {
				newList.add(stock);
			}
		}
		return newList;
	}
}
