package cursors;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class DescendingIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Object> ll = new LinkedList<Object>();
		   ll.add("Welcome");
		   ll.add(78);
		   ll.add('r');
		   ll.add(70);
		   ll.add("Java");
		   ll.add(null);
		   ll.add("Developers");
		   ll.add(45785678567854l);
		   Iterator<Object> di = ll.descendingIterator();
		   while(di.hasNext())
		   {
			   System.out.println(di.next());
		   }
	 
		   
		   TreeSet<Integer> ts = new TreeSet<Integer>(); 
			ts.add(88);
			ts.add(77);
			ts.add(33);
			ts.add(22);
			ts.add(44);
			ts.add(55);
			ts.add(45);
			ts.add(82);
			ts.add(56);
			Iterator<Integer> tsi = ts.descendingIterator();
			   while(tsi.hasNext())
			   {
				   System.out.println(tsi.next());
			   }

	}

}
