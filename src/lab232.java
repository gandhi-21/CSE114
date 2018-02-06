import java.util.*;

public class lab232{
	
	public static String dec2Bin(int value)
	{
		String num = new String();
		if(value/2==0)
		{
			num = value%2 + num;
			return num;
		}
		else
		{
			num = dec2Bin(value/2) + value%2;
			return num;
		}
	}
	
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the decimal(base 10) integer:");
		int number = reader.nextInt();
		reader.close();
		String bin = dec2Bin(number);
		System.out.println("The value of entered number in Binary is:" 
		+ bin);
	}
}