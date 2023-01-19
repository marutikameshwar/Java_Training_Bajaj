package Day1_Java.Day1_Assignment;
import java.util.Scanner;
public class Main {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        Functions obj=new Functions();
		obj.Maximum();
		obj.ReplaceWithVariable();
		obj.ReplaceWithoutVariable();
		obj.FindNumber();
		obj.FindPrime();
		obj.Palindrome();
		int Number=input.nextInt();
		System.out.println(Cube(Number));
		Employee emp=new Employee();
		emp.AddEmployee(1, "maruti",75000 );
		emp.AddEmployee(2, "jaideep", 25000);
		emp.AddEmployee(3, "koushiq", 55000);
		emp.SalaryGreterThan50();
		emp.TotalObjects();
    }
    public static int Cube (int num1)
	{
		int solution = num1*num1*num1;
		return solution;
	}	
}
