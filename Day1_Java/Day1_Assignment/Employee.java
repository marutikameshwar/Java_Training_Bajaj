package Day1_Java.Day1_Assignment;

import java.util.LinkedList;

public class Employee {
    LinkedList<Integer> Eid=new LinkedList<Integer>();
	LinkedList<String> Ename=new LinkedList<String>();
	LinkedList<Integer> Esalary=new LinkedList<Integer>();
	public void AddEmployee(int Eid,String Ename,int Esalary)
	{
		this.Eid.add(Eid);
		this.Ename.add(Ename);
		this.Esalary.add(Esalary);
	}
	public void SalaryGreterThan50()
	{
		for(int i=0;i<Eid.size();i++)
		{
			if(Esalary.get(i)>50000)
			{
				System.out.println("Employee id : "+Eid+" Ename : "+Ename+" Esalary : "+Esalary);
			}
		}
	}
	public void TotalObjects()
	{
		System.out.println("total number of objects : "+Eid.size());
	}
}
