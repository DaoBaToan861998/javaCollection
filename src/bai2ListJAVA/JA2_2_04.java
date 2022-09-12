package bai2ListJAVA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JA2_2_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> lst=new ArrayList<String>();
lst.add("1");
lst.add("2");
lst.add("3");
lst.add("4");
List<String> lst2=new ArrayList<String>();
lst2.add("A");
lst2.add("B");
lst2.add("C");
lst2.add("D");
Collections.copy(lst2, lst);
System.out.println(lst);
System.out.println(lst2);
	}

}
