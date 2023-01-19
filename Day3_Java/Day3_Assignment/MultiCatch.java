package Day3_Java.Day3_Assignment;

public class MultiCatch {
    public void MultiCatchBlock()
	{
		int result;
		try
		{
			result=10/0;
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}    
}
