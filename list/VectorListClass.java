package Collcetions.List;

import java.util.Vector;

public class VectorListClass {
   public static void main(String[]agrs) {
	   int[] arr = new int [5];
			   Vector<Integer> vlist = new Vector<>(10);
   	vlist.add(20);
   	vlist.add(30);
   	vlist.add(72);
   	vlist.add(2,69);
   	vlist.set(3,24);
   	vlist.remove(1);
   	System.out.println(vlist.reversed());
   	System.out.println(vlist.contains(100));
   	System.out.println(vlist.size());
   	System.out.println(vlist);
   	
   }
}
