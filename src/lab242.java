
public class lab242{
	
	static int max = 0;
	
	public static int max(int a, int b)
	{
		if (a > b) {return a;}
		else {return b;}
	}
	
	public static int findLargest(int [] list, int currentIndex)
	{
		if(currentIndex == 0)
			return max;
		else
		{
			if(list[currentIndex] > max)
			{
				max = list[currentIndex];
			}
			return findLargest(list, currentIndex - 1);
		}
	}
	
	public static void main(String[] args)
	{
		int list [] = new int[10];
		for(int i=0;i<10;i++)
		{
			list[i] = (int) (Math.random() * 10);
		}
		for(int j = 0;j<10;j++)
		{
			System.out.print(list[j] + " ");
		}
		System.out.println();
		System.out.println(findLargest(list,9));
	}
}