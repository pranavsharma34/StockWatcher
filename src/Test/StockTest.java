package Test;

import org.junit.Test;

public class StockTest { 

	@Test
	public void testStockFB() { 
		
		System.out.println("Facebook Stock");

		Stock facebook = StockFetcher.getStock("FB");
		System.out.println("Price: " + facebook.getPrice());
		System.out.println("Volume: " + facebook.getVolume()); 
		System.out.println("P/E: " + facebook.getPe());
		System.out.println("EPS: " + facebook.getEps());
		System.out.println("Year Low: " + facebook.getWeek52low());
		System.out.println("Year High: " + facebook.getWeek52high());
		System.out.println("Day Low: " + facebook.getDaylow());
		System.out.println("Day High: " + facebook.getDayhigh());
		System.out.println("50 Day Moving Av: " + facebook.getMovingav50day());
		System.out.println("Market Cap: " + facebook.getMarketcap());
		
		System.out.println('\n');

	} 
	
	@Test
	public void testStockGoogle() { 

		System.out.println("Google Stock");

		Stock google = StockFetcher.getStock("GOOG");
		System.out.println("Price: " + google.getPrice());
		System.out.println("Volume: " + google.getVolume()); 
		System.out.println("P/E: " + google.getPe());
		System.out.println("EPS: " + google.getEps());
		System.out.println("Year Low: " + google.getWeek52low());
		System.out.println("Year High: " + google.getWeek52high());
		System.out.println("Day Low: " + google.getDaylow());
		System.out.println("Day High: " + google.getDayhigh());
		System.out.println("50 Day Moving Av: " + google.getMovingav50day());
		System.out.println("Market Cap: " + google.getMarketcap());
		
		System.out.println('\n');

	} 
	
	@Test
	public void testStockBB() { 

		System.out.println("Blackberry Stock");

		Stock bb = StockFetcher.getStock("BBRY");
		System.out.println("Price: " + bb.getPrice());
		System.out.println("Volume: " + bb.getVolume()); 
		System.out.println("P/E: " + bb.getPe());
		System.out.println("EPS: " + bb.getEps());
		System.out.println("Year Low: " + bb.getWeek52low());
		System.out.println("Year High: " + bb.getWeek52high());
		System.out.println("Day Low: " + bb.getDaylow());
		System.out.println("Day High: " + bb.getDayhigh());
		System.out.println("50 Day Moving Av: " + bb.getMovingav50day());
		System.out.println("Market Cap: " + bb.getMarketcap());
		
		System.out.println('\n');

	} 
	
	@Test
	public void testStockIBM() { 

		System.out.println("IBM Stock");

		Stock ibm = StockFetcher.getStock("IBM");
		System.out.println("Price: " + ibm.getPrice());
		System.out.println("Volume: " + ibm.getVolume()); 
		System.out.println("P/E: " + ibm.getPe());
		System.out.println("EPS: " + ibm.getEps());
		System.out.println("Year Low: " + ibm.getWeek52low());
		System.out.println("Year High: " + ibm.getWeek52high());
		System.out.println("Day Low: " + ibm.getDaylow());
		System.out.println("Day High: " + ibm.getDayhigh());
		System.out.println("50 Day Moving Av: " + ibm.getMovingav50day());
		System.out.println("Market Cap: " + ibm.getMarketcap());
		
		System.out.println('\n');

	} 
	
	@Test
	public void testStockApple() { 

		System.out.println("Apple Stock");

		Stock apple = StockFetcher.getStock("AAPL");
		System.out.println("Price: " + apple.getPrice());
		System.out.println("Volume: " + apple.getVolume()); 
		System.out.println("P/E: " + apple.getPe());
		System.out.println("EPS: " + apple.getEps());
		System.out.println("Year Low: " + apple.getWeek52low());
		System.out.println("Year High: " + apple.getWeek52high());
		System.out.println("Day Low: " + apple.getDaylow());
		System.out.println("Day High: " + apple.getDayhigh());
		System.out.println("50 Day Moving Av: " + apple.getMovingav50day());
		System.out.println("Market Cap: " + apple.getMarketcap());
		
		System.out.println('\n');

	} 
	
	@Test
	public void testStockTweed() { 

		System.out.println("Tweed Stock");

		Stock Tweed = StockFetcher.getStock("TWD.V");
		System.out.println("Price: " + Tweed.getPrice());
		System.out.println("Volume: " + Tweed.getVolume()); 
		System.out.println("P/E: " + Tweed.getPe());
		System.out.println("EPS: " + Tweed.getEps());
		System.out.println("Year Low: " + Tweed.getWeek52low());
		System.out.println("Year High: " + Tweed.getWeek52high());
		System.out.println("Day Low: " + Tweed.getDaylow());
		System.out.println("Day High: " + Tweed.getDayhigh());
		System.out.println("50 Day Moving Av: " + Tweed.getMovingav50day());
		System.out.println("Market Cap: " + Tweed.getMarketcap());
		
		System.out.println('\n');

	} 


}