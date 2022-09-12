package bai3Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JA2_3_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer> set1= new HashSet<>();
set1.addAll(Arrays.asList(new Integer[] {1,2,3,4,5}));
Set<Integer> set2= new HashSet<>();
set2.addAll(Arrays.asList(new Integer[] {4,5,6,7,8}));
set1.remove(1);
//set1.remove(1) xóa phần tử 1
System.out.println("so phần tử sau khi xoa la:"+set1);
set1.removeAll(set2);
//set1.remove(set2) là xoa các phần tử 1 có trong phần tử 2
System.out.println("xóa các phần tử ở trong ds 1 chưa ds2"+set1);
set1.clear();
//set.clear là xoa hết các phần tử trong ds
System.out.println("xóa hết các phần tử"+set1);
	}

}
