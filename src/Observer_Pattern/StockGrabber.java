package Observer_Pattern;

import java.util.ArrayList;
import java.util.HashMap;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private HashMap<String, Double> prices = new HashMap<String, Double>(); 
	
	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}
	
	public void register(Observer newObserver) {
		observers.add(newObserver);
	}

	public void unregister(Observer observer) {
		int index = observers.indexOf(observer);
		observers.remove(index);
		
		System.out.println("Observer " + (index+1) + " deleted");
	}

	public void notifyObserver() {
		for (Observer observer: observers) {
			observer.update(prices);
		}
	}
	
	public void setPrice(double newPrice, String name) {
		if (prices.containsKey(name)) {
			prices.replace(name, newPrice);
		} else {
			prices.put(name, newPrice);
		}
		notifyObserver();
	}
	
}
