package bai2ListJAVA;
import java.util.*;
public class JA2_2_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> lst= new ArrayList<Integer>();
lst.add(1);
lst.add(4);
lst.add(7);
lst.add(8);
lst.add(9);
lst.add(6);
lst.add(3);
lst.add(2);
lst.add(5);
System.out.println("danh sach chưa dảo ngược");
System.out.println(lst);
System.out.println("danh sách đảo ngược");
Collections.reverse(lst);
System.out.println(lst);
	}

}
