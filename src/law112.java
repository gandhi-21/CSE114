import java.util.*;
public class law112{
	 public static int [ ] [ ] createSquare (int size)
	 {
	int [] [] magic_matrix =  new int [size] [size] ;
	int number = 1,  row = 0,column = size/2,current_row,current_column;
	while (number <= (size*size)) {
	    magic_matrix[row][column] = number;
	    number += 1;
		current_row = row;
		current_column = column;
		 row -= 1;
		 column -= 1;
		if(row <= -1) 
		 row = size - 1;
		if(column <= -1)
		 column = size - 1;
		if(magic_matrix[row][column] != 0)  {
		 row = current_row + 1;
		 column = current_column;
			if(row <= -1) 
			row = size - 1;
		}
		}
	return magic_matrix	;
	 }
	 
	 
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		int n;
		System.out.print("Enter the size of the magic square (odd numbers only):");
		n = stdin.nextInt();
		int [] [] Arr = new int [n] [n];
		Arr = createSquare(n);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(Arr[i][j] + " ");
			}
			System.out.println();
		}
		stdin.close();
	}
}