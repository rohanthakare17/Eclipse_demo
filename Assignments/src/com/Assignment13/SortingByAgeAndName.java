package com.Assignment13;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortingByAgeAndName {
	public static void main(String[] args) {
		UserDetails details1 = new UserDetails("Kalpesh", "Patil", 24);
		UserDetails details2 = new UserDetails("Vipul", "Patil", 25);
		UserDetails details3 = new UserDetails("Nakul", "Chaudhari", 25);
		
		Comparator<UserDetails> comp1 = new AgeAscendingComparator();
		SortedSet<UserDetails> allUsers = new TreeSet<UserDetails>(comp1);
		allUsers.add(details1);
		allUsers.add(details2);
		allUsers.add(details3);
		
		for(UserDetails details:allUsers) {
			System.out.println(details);
		}


	}
}
