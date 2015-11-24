package Observer_Pattern;

public class StockMarket {
	public static void main (String[] args) {
		
		StockGrabber grabber = new StockGrabber();
		StockObserver obeserver1 = new StockObserver(grabber);
		
//		grabber.setPrice(197.00, "IBM");
//		grabber.setPrice(667.00, "APPL");
//		grabber.setPrice(619.00, "GOOL");
//		
//		StockObserver obeserver2 = new StockObserver(grabber);
//		
//		grabber.setPrice(197.00, "IBM");
//		grabber.setPrice(667.00, "APPL");
//		grabber.setPrice(619.00, "GOOL");
//		
//		grabber.unregister(obeserver1);
//		
//		grabber.setPrice(197.00, "IBM");
//		grabber.setPrice(667.00, "APPL");
//		grabber.setPrice(619.00, "GOOL");
		
		Runnable IBM = new ThreadedStockMarket(grabber, 2, "IBM", 197.00);
		Runnable APPL = new ThreadedStockMarket(grabber, 2, "APPL", 677.00);
		Runnable GOOL = new ThreadedStockMarket(grabber, 2, "GOOL", 676.00);
		
		new Thread(IBM).start();
		new Thread(APPL).start();
		new Thread(GOOL).start();
	}
}
