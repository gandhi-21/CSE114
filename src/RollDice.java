// Name: Gaurav Gandhi	
// SBU ID : 111697599

import java.util.*;

public class RollDice{
	public static int rollDice(String S)
{
	int index  = S.indexOf('d');
	String s1 = S.substring(0,index);
	String s2 = S.substring(index+1, S.length());
	int num = Integer.parseInt(s1);
	int size = Integer.parseInt(s2);
	int roll = 0;
	for(int i=1;i<=num;i++)
	{
		int value = (int) (Math.random()*size);
		roll += value;
	}
	return roll;
}
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		String S = new String();
		S = stdin.next();
		int value = rollDice(S);
		System.out.print(value);
		stdin.close();
	}
}