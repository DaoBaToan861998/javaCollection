package bai3Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JA2_3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set1=new HashSet<>();
		set1.addAll(Arrays.asList(new Integer[] {1,2,5,0,6,7}));
		Set<Integer> set2=new HashSet<>();
		set2.addAll(Arrays.asList(new Integer[] {0,9,7,5,3,8}));
		set1.retainAll(set2);
		//set1.retainAll(set2) có nghĩa là tìm ra các phần tử trung nhau của 2 ds
		System.out.println("các phần tử trung nhau trong 2 set la"+set1);
	}

}
