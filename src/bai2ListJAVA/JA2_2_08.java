package bai2ListJAVA;

import java.util.ArrayList;
import java.util.List;

public class JA2_2_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
System.out.println("in cac phan tu trong danh sach list:"+lst);
int so=lst.remove(2);
System.out.println("in cac phan tu trong danh sach sau khi xoa la"+lst);
System.out.println("phan tu bi xoa do la"+so);
	}

}
