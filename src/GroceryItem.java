 class GroceryItem{
	private	String name;
	private int quantity;
	private double unitprice;
	
	GroceryItem(String name, int quantity, double unitprice)
	{this.setName(name);
	this.quantity = quantity;
	this.unitprice = unitprice;}
	
	public double getCost()
	{return quantity*unitprice;}
	
	public void setQuantity(int quantity)
	{this.quantity = quantity;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}