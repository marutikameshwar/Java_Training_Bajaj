package Day3_Java.collections;

import java.util.Comparator;

import Day2_Java.relations.*;

public class MyNameComparator implements Comparator <Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}

