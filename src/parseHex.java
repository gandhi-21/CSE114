import java.util.*;

public class parseHex{
	
	public static int ParseHex(String S) throws HexFormatException
	{
		int answer = 0;
		int i = S.length() - 1;
		int currentPower = 1;
		while(i>=0)
		{
			int number;
			if(S.charAt(i) == 'A')
				number = 'A' - 'A' + 10;
			else if(S.charAt(i) == 'B')
				number = 'B' - 'A' + 10;
			else if (S.charAt(i) == 'C')
				number = 'C' - 'A' + 10;
			else if(S.charAt(i) == 'D')
				number = 'D' - 'A' + 10;
			else if(S.charAt(i) == 'E')
				number = 'E' - 'A' + 10;
			else if(S.charAt(i) == 'F')
				number = 'F' - 'A' + 10;
			else if(Character.isDigit(S.charAt(i))==true)
				{number = S.charAt(i) - '0';}
			else
				throw new HexFormatException();
		//	number =  S.charAt(i) - '0';
		//	System.out.println(number);
			answer = answer + (number * currentPower);
			currentPower = currentPower * 16;
			i--;
		}
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the value of the number in HexaDecimal: ");
		String s;
		s = reader.next();
		int result;
		try {
		result = ParseHex(s);
		System.out.println("The entered value in Decimal is : " + result);}
		catch(HexFormatException ex)
		{
			System.out.println(ex);
		}
		finally {
			System.out.println("The entered value was: " + s );
		}
		reader.close();
	}
	
}

class HexFormatException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HexFormatException()
	{
		super("Wrong Format of the entered value.");
	}
	
}