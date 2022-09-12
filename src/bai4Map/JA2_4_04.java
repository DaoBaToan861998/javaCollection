package bai4Map;

import java.util.HashMap;

public class JA2_4_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String>hs=new HashMap<>();
hs.put(1,"red");
hs.put(2,"green");
hs.put(3,"blue");
System.out.println("hm trước khi xóa là"+hs);
hs.remove(1);
System.out.println("hm sau khi xóa là"+hs);
	}

}
