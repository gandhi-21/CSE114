public class Color{
	
	private int Red;
	private int Green;
	private int Blue;
	String Name;
	
	Color(int Red, int Green, int Blue)
	{	this.Red = Red;
		this.Green = Green;
		this.Blue = Blue;
		Name = null;}
	
	Color(int Red, int Green, int Blue, String Name)
	{	this.Red = Red;
		this.Green = Green;
		this.Blue = Blue;
		this.Name = Name;}
	
	public int getRed()
	{ return Red;}
	
	public int getGreen()
	{ return Green;}
	
	public int getBlue()
	{ return Blue;}
	
	public String getName()
	{ return Name;}
	
	public static class AlphaChannelColor extends Color{
		private int Opacity;
		
		AlphaChannelColor(int Red, int Green, int Blue, int Opacity)
		{   super(Red,Green,Blue);
			this.Opacity = Opacity;}
		
		AlphaChannelColor(int Red, int Green, int Blue, String Name, int Opacity)
		{   super(Red,Green,Blue,Name);
			this.Opacity = Opacity;}
		
		public String getName()
		{
			String result;
			String color = super.getName();
			if(color == null)
				color = "color";
			if(Opacity<100)
			{   result = "Opaque" + color;
				return result;}
			else if(Opacity>=100 && Opacity<= 199)
			{  result = "semi-transparent" + color;
				return result;}
			else
			{  result = "transparent" + color;
				return result;}
			
		}
		
	}
	public static void main(String[] args)
	{
		Color first  = new Color(1,2,3,"Green");
		AlphaChannelColor second = new AlphaChannelColor(3,1,2,"Green",150);
		
		System.out.println("Name of the first color are:  " + first.getName() );
		System.out.println("Name of the second color is: " + second.getName());
		System.out.println("Values of Red, Green and Blue for first Class Color are: " + first.getRed() + " " 
							+ first.getGreen() + " " + first.getBlue());
		System.out.println("Values of Red, Green and Blue for second Class AlphaChanneColor are: " + second.getRed() + " " 
				+ second.getGreen() + " " + second.getBlue());
	}
}