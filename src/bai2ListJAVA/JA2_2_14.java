package bai2ListJAVA;

import java.util.ArrayList;

public class JA2_2_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> lst=new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(9);
ArrayList<Integer> lst2=new ArrayList<>();
lst2.add(5);
lst2.add(6);
lst2.add(7);
lst2.add(4);
lst2.add(4);
lst.retainAll(lst2);
//phương thức retainALL giup liệt lê các phần tử trùng nhau
System.out.println("cac phan tu trung nhau la "+lst);
System.out.println("cac phan tu cua lst2 la"+lst2);



		
	}

}
