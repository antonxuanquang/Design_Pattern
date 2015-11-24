package Observer_Pattern;

import java.util.ArrayList;
import java.util.HashMap;

public class StockObserver implements Observer{

	private HashMap<String, Double> prices;
	private static int observerIDTracker = 0;
	private int observerID;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker;
		
		System.out.println("New Observer " + this.observerID);
		
		stockGrabber.register(this);
	}
	
	public void update(HashMap<String, Double> prices) {
		this.prices = prices;
		printThePrices();
	}
	
	public void printThePrices() {
		System.out.println("ObserverID: " + observerID);
		for (String key : prices.keySet()) {
			System.out.println("\t" + key + ": " + prices.get(key));
		}
		System.out.println("\n");
	}

}
