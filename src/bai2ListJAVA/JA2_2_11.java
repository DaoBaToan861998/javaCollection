package bai2ListJAVA;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class JA2_2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> lst= new ArrayList<>();
lst.add("cam");
lst.add("quyt");
lst.add("mit");
lst.add("dua");
lst.add("le");
lst.add("tao");
lst.add("oi");
lst.add("mo");
System.out.println("mang truoc khi sap xap"+lst);
//phương thức collections.sort dùng để xắp xếp chuỗi theo bảng chữ cai từ a đến z
Collections.sort(lst);
System.out.println("mang sau khi sap xap la"+lst);
	}

}
