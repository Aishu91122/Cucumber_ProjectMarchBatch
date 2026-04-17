package cursors;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Object> vv = new Vector<Object>();
		   vv.add("Welcome");
		   vv.add(78);
		   vv.add('r');
		   vv.add(70);
		   vv.add("Java");
		   vv.add(null);
		   vv.add("Developers");
		   vv.add(45785678567854l);
		   ListIterator<Object> vli = vv.listIterator();
		   while(vli.hasNext())
		   {
			   System.out.println(vli.next());
		   }
		   
		   System.out.println("===========================");
		   
		   while(vli.hasPrevious())
		   {
			   System.out.println(vli.previous());
		   }
		   
		   System.out.println("======================");
		   
		   LinkedList<Object> ll = new LinkedList<Object>();
		   ll.add("Welcome");
		   ll.add(78);
		   ll.add('r');
		   ll.add(70);
		   ll.add("Java");
		   ll.add(null);
		   ll.add("Developers");
		   ll.add(45785678567854l);
		   
		   ListIterator<Object> lli = ll.listIterator();
		   while(lli.hasNext())
		   {
			   System.out.println(lli.next());
		   }
		   
		   System.out.println("==============");
		   
		   while(lli.hasPrevious())
		   {
			   System.out.println(lli.previous());
		   }
		   
		   
		   
		   

	}

}
