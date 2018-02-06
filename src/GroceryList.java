public class GroceryList{
	private GroceryItem[] Gr = new GroceryItem[10];
	private int currentItems;
	
	GroceryList()
	{
		currentItems = 0;
	}
	
	public void Add(GroceryItem G)
	{
	
		if(currentItems<10)
		{
			Gr[currentItems] = G;
			currentItems+=1;
		}
		
	}
	
	public double getTotalCost()
	{
		double total = 0;
		for(int i=0;i<currentItems;i++)
		{
			
			total += Gr[i].getCost();
		}
		return total;
	}
	
	public static void main(String[] args)
	{
		GroceryList list = new GroceryList();
		GroceryItem G1 = new GroceryItem("milk",2,1);
		GroceryItem G2 = new GroceryItem("Cake",3,2);
		GroceryItem G3 = new GroceryItem("Soda",4,3);
		
		list.Add(G1);
		list.Add(G2);
		list.Add(G3);
		
		System.out.println("Sum of the items in the list are: " + list.getTotalCost());
		
	}
}