package bai2ListJAVA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JA2_2_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Iterator iterator;
List<Integer> lst=new ArrayList<>();
lst.add(1);
lst.add(4);
lst.add(7);
lst.add(8);
lst.add(9);
lst.add(6);
lst.add(3);
lst.add(2);
lst.add(5);
System.out.println("hien thi cac phan tu trong list");
iterator =lst.iterator();
//lst gọi lại iterrator
while(iterator.hasNext()) {
	System.out.println(iterator.next());
}
	}

}
