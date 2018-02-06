import java.util.*;

public class lab241{
	
	public static String reverse(String original)
	{	// System.out.println(original.length());
		return reverse(original,0,original.length());}
	
	public static String reverse(String source, int lowIndex, int highIndex)
	{
		if(lowIndex == highIndex)
		{	/qazw/ System.out.println(source.charAt(lowIndex));
		//	return Character.toString(source.charAt(lowIndex));
			return "";}
		else 
		{	
			String a = source.substring(lowIndex,lowIndex+1);
			String b = source.substring(highIndex-1,highIndex);
		//	System.out.println(b + " " + a);
			return b + reverse(source,lowIndex+1,highIndex-1) + a;
		}
	}
	
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the string to reverse: ");
		String str = reader.next();
		String reserve = reverse(str);
		System.out.println("The reversed String is:" + reserve);
		reader.close();
	}
}
 