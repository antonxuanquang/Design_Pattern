package Observer_Pattern;

import java.text.DecimalFormat;

public class ThreadedStockMarket implements Runnable {

	private int startTime;
	private String stock;
	private double price;
	
	private Subject stockGrabber;
	
	public ThreadedStockMarket (Subject stockGrabber, int newStartTime,
			String newStock, double newPrice) {
		this.stockGrabber = stockGrabber;
		startTime = newStartTime;
		
		stock = newStock;
		price = newPrice;
	}
	
	public void run() {
		for (int i = 1; i <= 20; i++) {
			try{
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
			
			double randNum = (Math.random() * (0.06)) - 0.03;
			DecimalFormat df = new DecimalFormat("#.##");
			
			price = Double.valueOf(df.format(price + randNum));
			((StockGrabber)stockGrabber).setPrice(price, stock);
			
			System.out.println(stock + ": " +  df.format(price + randNum) +
					" " + df.format(randNum));
			System.out.println();
		}
		
	}

}
