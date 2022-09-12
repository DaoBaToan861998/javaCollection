package bai2ListJAVA;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class JA2_2_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> lst=new ArrayList<Integer>();
lst.add(1);
lst.add(4);
lst.add(7);
lst.add(8);
lst.add(9);
lst.add(3);
lst.add(2);
lst.add(5);
Collections.shuffle(lst);
System.out.println(lst);

	}

}
