package bai2ListJAVA;

import java.util.ArrayList;
import java.util.List;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//List<Integer> lst=new ArrayList<Integer>();
//lst.add(1);
//lst.add(4);
//lst.add(7);
//lst.add(8);
//lst.add(9);
//lst.add(6);
//lst.add(3);
//lst.add(2);
//lst.add(5);
//System.out.println(lst);
//System.out.println(lst.get(7));
//System.out.println(lst.indexOf(4));
		 ArrayList<String> languages= new ArrayList<>();
		    //sử dụng phương thức add() để thêm phần tử cho mảng languages
		    languages.add("Java");
		    languages.add("Python");
		    languages.add("C");
		    System.out.println("Mảng arraylist languages: " + languages);
		    // tạo mảng một chiều arr với độ dài bằng với độ dài của mảng languages
		    String[] arr = new String[languages.size()];
		    //chuyển đổi mảng arraylist languages thành mảng một chiều arr
		    languages.toArray(arr);
		    // xuất mảng một chiều ra màn hình
		    System.out.print("Mảng một chiều arr: ");
		    for(String item:arr) {
		      System.out.print(item+", ");
		    }
		    System.out.println("\n---------------------------------");
		    System.out.println("Chương trình này được đăng tại Freetuts.net");
	}

}
