public class SortedIntegerArray {

	private int [] array;
	private int point;
	
	public SortedIntegerArray(int capacity)
	{	point = 0;
		array = new int[capacity];}
	
	public int getsize()
	{	return point;}
	
	public int getValue(int index)
	{	if(index<0 || index >= array.length)
			return -1;
		else
			return array[index];	}

	public String toString()
	{	String result="";
		int index = getsize();
		
		for(int j=0 ;j<index;j++)
		{
			
			result += getValue(j) + ",";
		}
		return result;}

	public boolean isFull()
	{
		return point == array.length;
	}
	
	public void add(int value)
	{
		if(isFull())
			return;
		array[point++] = value;
		int i =point;
		while( i >1 && array[i-1] < array[i-2])
		{
			int temp = array[i-1];
			array[i-1] = array[i-2];
			array[i-2] = temp;
			i--;
		}
	}
	
	public void remove(int index)
	{
		if(index>=0 && index<point)
		{
			point--;
			for(int i=index;i<point;i++)
			{
				array[i] = array[i+1];
			}
		}
	}
	
	public static void main(String[] args)
	{
		SortedIntegerArray aa = new SortedIntegerArray(10);
		aa.add(1);
		aa.add(5);
		aa.add(4);
		aa.add(2);
		aa.add(3);
		aa.remove(3);
		System.out.println(aa.toString());
	}
}
