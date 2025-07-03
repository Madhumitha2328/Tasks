package Collcetions.Map;

import java.util.HashMap;

public class HashMapClass {
	Object[] arr = new Object[5];
   public static void main(String[]agrs) {
	   HashMap<String,Object> hm = new HashMap<>();
	   hm.put("name","Dhilip");
	   hm.put("Age",22);
	   hm.put(null,"Arav");
	   System.out.println(hm);
   }
}
