package designpatter.strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyPattern {

	public static void main(String []args) {
		List<Stock> stockList = new ArrayList();
		
		stockList.add(new Stock("AAPL", 318.65, 10));
		stockList.add(new Stock("MSFT", 166.86, 45));
		stockList.add(new Stock("Google", 99, 12.5));
		stockList.add(new Stock("AMZ", 1866.74, 45));
		stockList.add(new Stock("GOOGL", 1480.20, 3.5));
		stockList.add(new Stock("AAPL", 318.65, 8));
		stockList.add(new Stock("AMZ", 1866.74, 9));
		
		List<Stock> filteredList = StockFilter.Filter(stockList, (stock) -> stock.getPrice() > 300);
		filteredList.forEach(System.out :: println);
		System.out.println("*******************");
		List<Stock> filteredListSymbol = StockFilter.Filter(stockList, (stock) -> stock.getSymbol().equals("AAPL"));
		filteredListSymbol.forEach(System.out :: println);
	}
}
