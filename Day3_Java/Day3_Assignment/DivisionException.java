package Day3_Java.Day3_Assignment;

public class DivisionException
{
    public void DivisionExceptionExecution()
	{
		int Num1=10;
		int Num2=0;
		int Result;
		try
		{
			Result=Num1/Num2;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("inside the finally block");
		}
	}
}