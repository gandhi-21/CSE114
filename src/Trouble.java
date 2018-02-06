// CSE 114 Lab 20 (Fall 2017)
//
// Your name: Gaurav Gandhi
// Your SBU ID:	111697599

import java.util.*;

public class Trouble
{
	public static void main (String [] args)
	{
		try {
    problem();}
		catch (ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Alpha");
			return;
		}
		catch (NullPointerException ex)
		{
			System.out.println("Beta");
			return;
		}
		catch (ArithmeticException ex)
		{
			System.out.println("Gamma");
			return;
		}
		
			System.out.println("Delta");
		
  }

  private static void problem()
  {
		Random r = new Random();

		int action = r.nextInt(4);

		if (action == 1)
		{
      System.out.println("About to generate an ArrayIndexOutOfBoundsException...");
			throw new ArrayIndexOutOfBoundsException();
		}

		if (action == 2)
		{
      System.out.println("About to generate a NullPointerException...");
			throw new NullPointerException();
		}

		if (action == 3)
		{
      System.out.println("About to generate an ArithmeticException...");
			throw new ArithmeticException();
		}

	}
}