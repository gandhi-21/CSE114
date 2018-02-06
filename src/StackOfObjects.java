public class StackOfObjects{
	
	private String [] Object;
	private int size;
	
	StackOfObjects()
	{	Object = new String[2];
		size = 0;
	}
	
	public int getsize()
	{	return size;}
	
	public void setsize()
	{
		size++;
	}
	public void push(String s)
	{	
		
		if(getlen()==size)
		{	expand(Object,getsize());}
			Object[getsize()] = s ;
			setsize();
	}
	
	public int getlen()
	{	//System.out.println(Object.length);
		return Object.length;}
	
	public void pop()
	{	size -= 1;}
	
	private void expand(String [] Objects, int side)
	{	
		String [] Objectss = new String[2*side];
			for(int i=0;i<side;i++)
				{Objectss[i] = Objects[i];}
			Object = Objectss;
	}
	
	public static void main(String[] args)
	{
		StackOfObjects Str = new StackOfObjects();
		Str.push("A");
		Str.push("B");
		System.out.println(Str.getlen() + " ");
		Str.push("C");
		Str.push("D");
		System.out.println(Str.getlen() + " " );
		Str.push("L");
		System.out.println(Str.getlen());
	}
}