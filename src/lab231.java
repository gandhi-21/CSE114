import java.util.*;
public class lab231{
	
	public static void reverseDisplay(int value)
	{
		if(value/10==0)
		{
			System.out.print(value);
			return;
		}
		else
		{
			System.out.print(value%10);
			reverseDisplay(value/10);
		}
			
	}
	
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the integer to reverse:");
		int number;
		number = reader.nextInt();
		reader.close();
		System.out.println("The digits in reverse order are:");
		reverseDisplay(number);
	}
}