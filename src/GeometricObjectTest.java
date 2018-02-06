public class GeometricObjectTest{
	
	public static void main(String[] args)
	{
		GeometricObject[] Object = {new Square(), new Triangle(), new Square(), new Triangle(), new Square()};
		for(int i=0;i<5;i++)
		{
			if(Object[i] instanceof Colorable)
			{	System.out.println("Colorable");
				System.out.println(((Colorable)Object[i]).HowToColor());}
			else
			{	System.out.println("Not Colorable. Area and Perimeter are: ");
				System.out.println(Object[i].getArea() + " " + Object[i].getPerimeter());}
		}
	}
}

class Square extends GeometricObject implements Colorable{
	
	public String HowToColor()
	{	return "With Love";}
	
	public double getArea()
	{	return 1.0;}
	
	public double getPerimeter()
	{	return 1.0;}
}

class Triangle extends GeometricObject{
	
	public double getArea()
	{	return 1.0;}
	
	public double getPerimeter()
	{	return 1.0;}
}