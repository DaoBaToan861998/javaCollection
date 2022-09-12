package bai4Map;

import java.util.HashMap;

public class JA2_4_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String> hs1=new HashMap<>();
hs1.put(1, "red");
hs1.put(2, "green");
hs1.put(3, "blue");
System.out.println(hs1.containsKey(4)?"có":"không");
	}

}
