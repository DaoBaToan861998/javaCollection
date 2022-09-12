package bai3Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class JA2_3_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> set1= new LinkedHashSet<>();
set1.add("toan");
set1.add("ly");
set1.add("hoa");
set1.add("van");
set1.add("anh");
set1.add("hoa");
System.out.println("các phần tử trước khi xóa"+set1);
set1.remove("toan");
//phương thức remote dùng để xóa các phần tử trong danh sách
System.out.println("các phần tử sau khi xoa là"+set1);

	}

}
