
public class complex{
	
	private int real;
	private int imagine;
	
	complex()
	{real = 0;
	imagine = 0;}
	
	complex(int a)
	{real = a;
	imagine = 0;}
	
	complex(int a, int b)
	{ real = a;
	imagine = b;}
	
	public String add(int a, int b,int c, int d)
	{
		real = a + c ;
		imagine = b + d ;
		return toString(real,imagine);}
	
	public String subtract(int a , int b, int c, int d)
	{
		real = a - c;
		imagine = b - d;
		return toString(real,imagine);}
	
	public String multiply(int a, int b, int c, int d)
	{
		real = (a*c) - (b*d);
		imagine = (b*c) + (a*d);
		return toString(real,imagine);}
	
	public String divide(int a, int b, int c, int d)
	{
		real =(a*c+b*d)/(c*c-d*d);
		imagine = (b*c-a*d)/(c*c+d*d);
		return toString(real,imagine);}
	
	public int getReal()
	{return real;}
	
	public int getImaginary()
	{return imagine;}
	
	public String toString(int real,int imagine)
	{
		String number = real + "+" + imagine + "i";
		return number;
	}
	 
	public static void main(String[] args)
	{
		complex num1 = new complex(2,3);
		complex num2 = new complex(3,4);
		
		complex num3 = new complex();
		System.out.println("Sum of numbers is: "+ num3.add(num1.getReal(), num1.getImaginary(), num2.getReal(), num2.getImaginary()));
		System.out.println("Subtraction of numbers is: "+ num3.subtract(num1.getReal(), num1.getImaginary(), num2.getReal(), num2.getImaginary()));
		System.out.println("Multiplication of numbers is: "+ num3.multiply(num1.getReal(), num1.getImaginary(), num2.getReal(), num2.getImaginary()));
		System.out.println("Division of numbers is: "+ num3.divide(num1.getReal(), num1.getImaginary(), num2.getReal(), num2.getImaginary()));
	}
	
}