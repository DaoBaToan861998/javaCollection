package bai2ListJAVA;

import java.util.ArrayList;
import java.util.Iterator;

public class JA2_2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> lst=new ArrayList<>();
lst.add("do");
lst.add("vang");
lst.add("xanh");
lst.add("cam");
lst.add("den");
lst.add("hong");
Iterator<String> itr=lst.iterator();
while(itr.hasNext()) {
	String value=itr.next();
	System.out.println(value);
}
	}

}
