import java.util.*;
public class lab12{
	
	public static String pad(String s)
	{
		while(s.length()<9)
		{
			s = "0" + s;
		}
		return s;
	}
	public static String convert(int no)
	{
		String result = "";
		while(no!=0)
		{
			if(no%2==0)
				result = "0" + result;
			else
				result = "1" + result;
			no = no/2;
		}
		if(result.length()!=9)
			result = pad(result);
		return result;
	}
	
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		int no;
		System.out.print("Enter a number between 0 and 511: ");
		no = stdin.nextInt();
		String output = convert(no);
		 char ch; int j=1;
		for(int i=0;i<9;i++)
		{
			if( output.charAt(i) == '0')
				ch = 'H';
			else
				ch = 'T';
			System.out.print(ch + " ");
				if(j%3==0)
					System.out.println();
			j++;
		}
		stdin.close();
	}
}