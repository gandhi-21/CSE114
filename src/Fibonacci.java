import java.util.*;

public class Fibonacci {
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		int N,P;
		System.out.println("Enter the no to be computed");
		N = reader.nextInt();
		System.out.println(" Enter the no to be printed");
		P = reader.nextInt();
		ArrayList<Integer> Fib = new ArrayList<Integer>(N);
		Fib.add(0);
		Fib.add(1);
		for(int i=2;i<N;i++)
		{
			int a = Fib.get(i-2);
			int b = Fib.get(i-1);
			Fib.add(a+b);
		}
		
		for(int i = N-P;i<N;i++)
		{
			System.out.println(Fib.get(i));
		}
		reader.close();
	}
	
}
