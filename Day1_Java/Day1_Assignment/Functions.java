package Day1_Java.Day1_Assignment;
import java.util.Scanner;
public class Functions {
    static Scanner input=new Scanner(System.in);
    public void Maximum()
	{
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		System.out.println(Math.max(num1,Math.max(num2,num3)));
	}
	public void ReplaceWithVariable()
	{
		int num1=input.nextInt();
		int num2=input.nextInt();
		int variable=num1;
		num1=num2;
		num2=variable;
		System.out.println("number1 : "+num1+" number2 : "+num2);
	}
	public void ReplaceWithoutVariable()
	{
		int num1=input.nextInt();
		int num2=input.nextInt();
		System.out.println("number 1 = "+num1+",number 2 = "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("after replacement");
		System.out.println("number 1 = "+num1+",number 2 = "+num2);
	}
	public void FindNumber()
	{
		int num1=input.nextInt();
		if(num1<0)
		{
			System.out.println("the number is negative");
		}
		else if(num1==0)
		{
			System.out.println("the number is 0");
		}
		else
		{
			System.out.println("the number is positive");
		}
	}
	public void FindPrime()
	{
		int num1=input.nextInt();
		if(num1==0)
		{
			System.out.println("the number is zero");
		}
		else
		{
			boolean prime=true;
			for(int i=num1-1;i>=2;i--)
			{
				if(num1%i==0)
				{
					System.out.println("the number is not prime");
					prime=false;
					break;
				}
			}
			if(prime==true)
			{
				System.out.println("the number is prime");
			}
		}
	}
	public void Palindrome() 
	{
		int num1=input.nextInt();
		int temp=0;
		int copy_num1=num1;
		while(num1>0)
		{
			temp=(temp*10)+(num1%10);
			num1=num1/10;
		}
		if(temp==copy_num1)
		{
			System.out.println("the number is palindrome");
		}
		else
		{
			System.out.println("the number is not palindrome");
		}
	}

}
