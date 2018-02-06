import java.util.*;

public class calculator{
	
	public static int calc(String input) throws IllegaloperatorException
	{
		int first = input.charAt(0) - '0';
		int second = input.charAt(4) - '0';
		char operator = input.charAt(2);
		
		if(operator=='+')
			return first+second;
		else if(operator=='-')
			return first-second;
		else if(operator=='*')
			return first*second;
		else if(operator=='/')
			return first/second;
		else if(operator=='%')
			return first%second;
		else
			throw new IllegaloperatorException(operator);
	}
	
	
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		String input = new String();
		int result;
		System.out.println("Please enter a calculation to perform: ");
		input = reader.nextLine();
		try {
		result = calc(input);
		System.out.println("The result of the calculation is: " + result);
		}
		catch(IllegaloperatorException ex)
		{
			System.out.println(ex);
		}
		reader.close();
	}
}

class IllegaloperatorException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegaloperatorException(char operator)
	{
		super("Invalid Operator entered:" + operator);
	}
}