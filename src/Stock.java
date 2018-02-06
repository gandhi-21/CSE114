
public class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public Stock(String symbol,String name)
	{ this.symbol = symbol;
	  this.name = name; }
	
	public String getSymbol()
	{return symbol;}
	
	public String getName()
	{return name;}
	
	public double getpreviousClosingPrice()
	{return previousClosingPrice;}
	
	public double getcurrentPrice()
	{return currentPrice;}
	
	public void setpreviousClosingPrice(double previousClosingPrice)
	{this.previousClosingPrice = previousClosingPrice;}
	
	public void setcurrentPrice(double currentPrice)
	{this.currentPrice = currentPrice;}
	
	public double changePercent()
	{
		return ((currentPrice-previousClosingPrice)/currentPrice)*100;
	}
	
	public static void main(String[] args)
	{
		Stock Google = new Stock("GOOG","Google Inc");
		Google.setpreviousClosingPrice(100);
		Google.setcurrentPrice(90);
		double change = Google.changePercent();
		System.out.printf(" %.2f ",change );
		System.out.print("%");
	}
	
}
