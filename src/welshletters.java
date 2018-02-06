import java.util.*;

public class welshletters {


	public static ArrayList<String> welshLetter(String word)
	{
		ArrayList<String> check = new ArrayList<String>(8);
		check.add("ch");
		check.add("dd");
		check.add("ff");
		check.add("ng");
		check.add("ll");
		check.add("ph");
		check.add("rh");
		check.add("th");
		ArrayList<String> answer = new ArrayList<String>(word.length());
		for(int i=0;i<=word.length()-1;i++)
		{
			if(i==word.length()-1)
			{
				answer.add(word.substring(i));
				continue;
			}
			String ch = new String();
			ch =  word.substring(i,i+2);
			if(check.contains(ch) == true)
				{
				answer.add(ch);	
				i+=1;
				}
			else
				answer.add(word.substring(i,i+1));
		}
		return answer;
	}
	
	public static void main(String[] args)
	{
		String word = new String();
		System.out.println("Enter the word: ");
		Scanner reader = new Scanner(System.in);
		word = reader.next();
		ArrayList<String> answer = new ArrayList<String>();
		answer = welshLetter(word);
		System.out.println(answer);	
		reader.close();
	}
}
