import java.util.Scanner;

public class scorecheck{
	public static void main (String[] args) throws Exception
	{
		java.io.File file = new java.io.File("scores.txt");
		int sum=0;	int no=0;
		double average = 0;
		Scanner input = new Scanner(file);
		while(input.hasNext())
		{	int score = input.nextInt();
			sum+=score;
			no++;	}
		average = sum/no;
		System.out.println("Sum of scores is: " + sum);
		System.out.println("Average of scores is: " + average);
		input.close();
		
	}
}