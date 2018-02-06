
public class Fan {

	public final int SLOW = 1;
	public final int MEDIUM = 2;
	public final int FAST = 3;
	private int speed = SLOW;
	private double radius = 5;
	private boolean on = false;
	private String color = "blue";
	
	public int getSpeed()
	{return speed;}
	
	public double getRadius()
	{return radius;}
	
	public boolean isOn()
	{return on;}
	
	public String getColor()
	{return color;}
	
	public void setSpeed(int speed)
	{this.speed = speed;}
	
	public void setRadius(double radius)
	{this.radius = radius;}
	
	public void setOn(boolean on)
	{this.on = on;}
	
	public void setColor(String color)
	{this.color = color;}
	
	public Fan()
	{}
	
	public String toString()
	{ String status = "";
	if(on==true)
		status =  speed + " " + color + " " + radius;
	else
		status =  color + " " + radius + " fan is off";
	return status;
	}
	
	public static void main(String[] args)
	{
		Fan first = new Fan();
		first.setSpeed(3);
		first.setRadius(10);
		first.setColor("yellow");
		first.setOn(true);
		System.out.println(first.toString());
		
		Fan second = new Fan();
		second.setSpeed(2);
		second.setRadius(5);
		second.setColor("blue");
		System.out.println(second.toString());
	}
	
}
