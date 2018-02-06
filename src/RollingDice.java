import java.util.Scanner;

// Name: Gaurav Gandhi
// SBU ID: 111697599

public class RollingDice{
	
	public static int[] countingSort(int [] Array, int min, int max)
	{
		for (int i = 0; i < Array.length; i++) {
			for (int j = i + 1; j < Array.length; j++) {
            			int tmp=0;
            			if (Array[i] > Array[j]) {
            				tmp = Array[i];
            				Array[i] = Array[j];
            				Array[j] = tmp;
            			}
			}
		}
		int r=max-min+1;
		int Arr[]=new int[r];
		
		for(int i=0;i<Arr.length;i++){
			Arr[i]=0;
		}
		for(int i=0;i<Array.length;i++){
			Arr[Array[i]-min]++;
		}
		return Arr;
	}
	
	public static int [] generate(int min, int max, int n)
	{
		int arr[] = new int[n];
		for(int i = 0; i < n;i++)
		{
			int value = (int)(Math.random() * (max-min+1) + min);
			arr[i] = value;
		}
		return arr;
	}
	
	public static void print(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		return;
	}
	
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		int n,min,max;
		n = stdin.nextInt();
		min = stdin.nextInt();
		max = stdin.nextInt();
		int [] Array = new int[n];
		Array = generate(min,max,n);
		print(Array);
		Array = countingSort(Array,min,max);
		print(Array);
		stdin.close();
	}
}