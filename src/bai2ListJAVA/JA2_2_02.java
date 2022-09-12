package bai2ListJAVA;

import java.util.ArrayList;
import java.util.List;

public class JA2_2_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> monHoc=new ArrayList<String>();
monHoc.add("toan");
monHoc.add("ly");
monHoc.add("hoa");
monHoc.add("van");
monHoc.add("anh");
monHoc.add("toanCaoCap");
monHoc.add("sinh");
System.out.println("mang mon hoc la"+monHoc);
String[] str=monHoc.toArray(new String[0]);
for(int i=0;i<str.length;i++)
{
	String contenst=str[i];
	System.out.print(contenst+" ");
}

	}

}
