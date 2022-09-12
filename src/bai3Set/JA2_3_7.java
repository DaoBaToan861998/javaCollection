package bai3Set;

import java.util.HashSet;
import java.util.Set;

public class JA2_3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> set1= new HashSet<>();
String str="codegym";
set1.add("cam");
set1.add("quyt");
set1.add("mit");
set1.add("dua");
set1.add("le");
set1.add("tao");
set1.add("oi");
System.out.println(set1);
System.out.println();
System.out.println(set1.contains(str)?"co":"không");
//hàm set1.contain(str) để kiểm tra xem la chuỗi có chứa trong SET hay không ?
	}

}
