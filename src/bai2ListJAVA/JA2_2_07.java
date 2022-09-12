package bai2ListJAVA;

import java.util.ArrayList;
import java.util.List;

public class JA2_2_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> lst=new ArrayList<>();
lst.add("cam");
lst.add("quyt");
lst.add("mit");
lst.add("dua");
lst.add("le");
lst.add("tao");
lst.add("dua");
lst.add("dao");
System.out.println("cac phan tu trong mang:"+lst);
int phantu1=lst.indexOf("dua");
System.out.println("vi  tri dau tien xuat hien cua dua la"+phantu1);
int phantu2=lst.lastIndexOf("dua");
System.out.println("vi tri cuoi cung xuat hien cua dua la"+phantu2);
int phantu3=lst.indexOf("mit");
System.out.println("vi tri dau tien xuat hien cua mit la"+phantu3);
int phantu4=lst.lastIndexOf("xoai");
System.out.println("vi tri cuoi cung cua le la"+phantu4);

	}

}
