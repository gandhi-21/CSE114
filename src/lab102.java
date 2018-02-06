import java.util.*;

public class lab102{

	public static int [ ] locateLargest(double [ ] [ ] a)
	{
		int [] location = {0,0};
		double max = a[0][0];
		int row = a.length;
		int col = a[0].length;
	//	System.out.println(row+" "+col);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(max<a[i][j])
				{
					location[0]=i;
					location[1]=j;
					max = a[i][j];
				}

			}
		}
		return location;
	}

	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int 	rows = stdin.nextInt();
		System.out.println("Enter the no of columns: ");
		int 	columns = stdin.nextInt();
			double [] [] Arr = new double [rows] [columns];
		int [] Location;		double no;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.println("enter element no " + i + " " + j);
				no = stdin.nextDouble();
				Arr[i][j]=no;
			}
		}
		Location = locateLargest(Arr);
		System.out.println("The largest element is at (" + Location[0] + "," + Location[1] +")");
		stdin.close();
	}
}
