package stockManagement;

public class StockData {
	public String stockName;
	public int numOfShares;
	public double sharePrice;
	public double totalvalue;
	
	public StockData(String stockName, int numOfShares, double sharePrice) {
		this.stockName = stockName;
		this.numOfShares = numOfShares;
		this.sharePrice = sharePrice;
	}
	public void setTotalSharePrice(double totalvalue) {
		this.totalvalue = totalvalue;
	}
	
	@Override
	public String toString() {
		return "Total Share Price For " +stockName+ " is : "+totalvalue+ "  With Share Price : "+sharePrice;
	}

}
