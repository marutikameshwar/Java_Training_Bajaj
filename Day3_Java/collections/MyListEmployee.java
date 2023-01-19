package Day3_Java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Day2_Java.relations.*;;

public class MyListEmployee {
	public static void main(String[] args) {
		
	}
	public static void myListSorting() {
		Employee emp1=new Employee(101,"Shaha",60);
		Employee emp2=new Employee(102,"Sha",70);
		Employee emp3=new Employee(103,"Suuu",80);
		Employee emp4=new Employee(103,"Suuu",80);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		//Collections.sort(list);//The method sort(List<T>) in the type Collections is not applicable for the arguments (List<Employee>)
		Collections.sort(list,new MySalaryComparator());
		for(Employee emp:list) {
			System.out.println(emp);
		}
	}
}
