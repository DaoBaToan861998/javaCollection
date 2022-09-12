package bai3Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JA2_3_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer> set1= new HashSet<>();
set1.addAll(Arrays.asList(new Integer[] {1,2,1,3,3,4,3,5,5}));
System.out.println(set1.isEmpty()?"co":"không");
	}

}
