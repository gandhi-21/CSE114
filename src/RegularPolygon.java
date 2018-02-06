
public class RegularPolygon {
	private int n;
	private double side;
	
	public RegularPolygon()
	{	n =  3;
		side = 1;}
	
	public RegularPolygon(int m,double s)
	{	n = m;
		side = s;}
	
	public int nofsides()
	{	return n;}
	
	public double sidelen()
	{	return side;}
	
	public void setSide(double sid)
	{	side = sid;}
	
	public void  setno(int no)
	{	n = no;}
	
	public double getPerimeter()
	{	return side*n;}

	
public static void main(String[] args)
{
	RegularPolygon first = new RegularPolygon(5,10);
	RegularPolygon second = new RegularPolygon(12,14);
	
	System.out.println("Properties of first Polygon are: \n" + "No of sides: " + first.nofsides() + "\n Length of a side: " + first.sidelen() + "\n Perimeter: " + first.getPerimeter());
	
	System.out.println("Properties of second Polygon are: \n" + "	No of sides: " + second.nofsides() + "\n Length of a side: " + second.sidelen() + "\n Perimeter: " + second.getPerimeter());
	
	}	
}