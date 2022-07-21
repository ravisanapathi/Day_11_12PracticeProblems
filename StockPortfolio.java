package stockManagement;

public class StockPortfolio {
	
	private int numOfStockName = 0;
	
	private StockData[] stockArray;
	
	public StockPortfolio() {
		stockArray = new StockData[3];
	}
	
	private void addStockData(String stockName, int numOfShares, double sharePrice) {
		stockArray[numOfStockName] = new StockData(stockName, numOfShares, sharePrice);
	    numOfStockName++;	
	}
	
	public void computeShares() {
		for (int i = 0; i < numOfStockName; i++) {
			stockArray[i].setTotalSharePrice(this.computeShares(stockArray[i]));
			System.out.println(stockArray[i]);
		}
	}
	public int computeShares(StockData stockData) {
		return (int) (stockData.numOfShares * stockData.sharePrice);
	}
	
	public static void main(String[] args) {
		StockPortfolio stockInfo = new StockPortfolio();
		stockInfo.addStockData("TATA", 10, 5.5);
		stockInfo.addStockData("IBM", 20, 8.0);
		stockInfo.addStockData("Google", 20, 12.5);
		stockInfo.computeShares();
	}

}