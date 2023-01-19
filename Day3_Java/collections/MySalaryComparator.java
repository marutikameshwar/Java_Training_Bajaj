package Day3_Java.collections;

import java.util.Comparator;

import Day2_Java.relations.*;;

public class MySalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary()>o2.getSalary())
			return 1;
		else if(o1.getSalary()>o2.getSalary())
			return -1;
		else
		return 0;
	}
	
}
