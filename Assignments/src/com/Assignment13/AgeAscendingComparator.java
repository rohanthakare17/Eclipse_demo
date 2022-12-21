package com.Assignment13;

import java.util.Comparator;

public class AgeAscendingComparator implements Comparator<UserDetails>{

	@Override
	public int compare(UserDetails o1, UserDetails o2) {
		Integer age1=o1.getAge();
		Integer age2=o2.getAge();
		String name1=o1.getFirstName();
		String name2=o2.getFirstName();
		int comparison=age1.compareTo(age2);
		if(comparison==0) {
			comparison=name1.compareTo(name2);
			if(comparison==0)
			comparison=1;
		}	
		return comparison;
	}

}
