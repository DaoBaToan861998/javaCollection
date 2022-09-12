package bai2ListJAVA;

import java.util.ArrayList;
import java.util.List;

public class JA2_2_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> lst=new ArrayList<Integer>();
lst.add(1);
lst.add(4);
lst.add(7);
lst.add(8);
lst.add(9);
lst.add(6);
lst.add(3);
lst.add(2);
lst.add(5);
for(int i=0;i<lst.size();i++)
{
	System.out.println(i+"-"+lst.get(i));
}
	}

}
