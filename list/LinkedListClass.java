package Collcetions.List;

import java.util.LinkedList;

public class LinkedListClass {
        public static void main(String[]agrs) {
        	int[] arr = new int [5];
        	LinkedList<Integer> llist = new LinkedList();
        	llist.add(20);
        	llist.add(30);
        	llist.add(72);
        	llist.add(2,69);
        	llist.add(3,24);
        	System.out.println(llist.reversed());
        	System.out.println(llist.contains(100));
        	System.out.println(llist.size());
        	System.out.println(llist);
        	
        	
        }
}
