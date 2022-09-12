package bai4Map;

import java.util.HashMap;

public class JA2_4_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String> hs1=new HashMap<>();
hs1.put(1,"red");
hs1.put(2,"green");
hs1.put(3, "blue");
HashMap<Integer, String> hs2=new HashMap<>();
hs2.put(4, "white");
hs2.put(5,"black");
hs2.put(6,"orange");
hs1.putAll(hs2);
System.out.println("thêm các phần tử trong map là"+hs1);
	}

}
