package Collcetions.List;

import java.util.ArrayList;

public class ArrayListClass {
   public static void main(String[]agrs) {
	   int[] arr = new int [5];
	   ArrayList<Integer> alist = alist = new ArrayList<>(10);
	   //wrapper class int integer float float double double long long
	   alist.add(10);
	   alist.add(20);
	   alist.add(30);
	   alist.add(2,40);
	   alist.set(3,50);
	   alist.remove(1);
	   System.out.println(alist.reversed());
	   System.out.println(alist.contains(100));
	   System.out.println();
   }
}
