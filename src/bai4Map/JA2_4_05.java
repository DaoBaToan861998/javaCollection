package bai4Map;

import java.nio.channels.FileChannel.MapMode;
import java.util.Map;
import java.util.TreeMap;

public class JA2_4_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String> tm=new TreeMap<>();
tm.put(1,"dot kich");
tm.put(2, "pubg mobile");
tm.put(3, "lap trinh java");
System.out.println("hien ra la:"+tm);
for (Map.Entry X : tm.entrySet()) {
	System.out.println(X.getKey()+" "+X.getValue());
}
	}

}
