package bai3Set;

import java.util.HashSet;
import java.util.Set;

public class JA2_3_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer> set1= new HashSet<>();
set1.add(1);
set1.add(1);
set1.add(3);
set1.add(6);
set1.add(5);
System.out.println(set1);
System.out.println("tong so phần tử la"+set1.size());
//hàm set1.size sẽ trả về số lượng phần tử trong 1 tập hợp
	}

}
