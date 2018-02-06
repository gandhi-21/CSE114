import java.util.*;

public class lab101{

	public static void distribute (int [ ] values, int start_index)
	{
		int temp = values[start_index];
		values[start_index] = 0;
		int end = values.length;
		int i=start_index+1;
		while(temp>0)
		{
			if(i == end)
				i=0;
			if(i==start_index)
			continue;
			values[i]++;
			i++;	
			temp--;
		}
	}

	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		int [] Arr = new int[16];
		int no;
		int start;
		for(int i=0;i<Arr.length;i++)
		{
		no = (int) (Math.random() * 13.0);
		Arr[i] = no;
		}
		System.out.println("Untouched Array is: ");
		for(int i=0;i<Arr.length;i++)
		{
		System.out.println(Arr[i]);
		}
		System.out.println("Enter starting index: ");
		start = stdin.nextInt();
		distribute(Arr,start);
		System.out.println("Changed Array is: ");
		for(int i=0;i<Arr.length;i++)
		{
		System.out.println(Arr[i]);
		}
		stdin.close();
	}
}
