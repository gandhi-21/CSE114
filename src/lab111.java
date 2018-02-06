import java.util.*;

public class lab111{
	
	public static boolean isMarkovMatrix(double [] [] matrix)
	{
		double sum = 0;
		for(int i = 0; i < 3; i++)
		{
			
			for(int j=0;j<3;j++)
			{
				if(matrix[j][i]<0)
				return false;
				else
				sum += matrix[j][i];
			}
			if(sum!=1)
			return false;
			else
			sum = 0;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		double no;
		double [] [] matrix = new double[3][3];
		System.out.print("Enter a 3 by 3 matrix, row by row: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				no = stdin.nextDouble();
				matrix[i][j] = no ;
			}
		}
		if(isMarkovMatrix(matrix) == true )
		System.out.println("This is a positive Markov matrix.");
		else
		System.out.println("This is not a positive Markov matrix.");
		stdin.close();
	}
}