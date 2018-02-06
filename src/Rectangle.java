
public class Rectangle {

	private double width;
	private double height;
	private String color;
	
	public Rectangle()
	{	width = 1;
		height = 1;
		color = "white";	}
	
	public Rectangle(double w, double h)
	{	width = w;
		height = h;
		color = "white";}
	
	public double getwidth()
	{	return width;}
	
	public double getheight()
	{	return height;}
	
	public String getcolor()
	{	return color;}
	
	public void setwidth(double w)
	{	width = w;}
	
	public void setheight(double h)
	{	height = h;}
	
	public void setcolor(String col)
	{	color = col;}
	
	public double getArea()
	{	return width*height;	}
	
	public double getPerimeter()
	{	return width+height;}
	
	public static void main(String[] args)
	{
		Rectangle first = new Rectangle(4,40);
		first.setcolor("red");
		Rectangle second = new Rectangle(3.5,35.9);
		second.setcolor("red");
		
		System.out.println("Properties of first rectangle "  + "\n Width:" + first.getwidth() + "\n Height:" + first.getheight() + "\n Color:" + first.getcolor()+ "\n Area:" + first.getArea() + "\n Perimeter:" + first.getPerimeter());
		System.out.println("Properties of second rectangle "  + "\n Width:" + second.getwidth() + "\n Height:" + second.getheight() + "\n Color:" + second.getcolor()+ "\n Area:" + second.getArea() + "\n Perimeter:" + second.getPerimeter());
		
	}
}
