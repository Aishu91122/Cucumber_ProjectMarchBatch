package collectionList;

import java.util.LinkedList;

public class LinkedListDemo {

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
		   ll.add(8876.78d);
		   ll.add(6.75f);
		   ll.add("Welcome");
		   ll.add(null);
		   System.out.println(ll);
		   ll.add(5, "PYTHON");
		   System.out.println(ll);
		   ll.remove(6.75f);
		   System.out.println(ll);
		   System.out.println(ll.size());
		   System.out.println(ll.get(3));
		   for (int i=0; i<=ll.size()-1; i++)
		   {
			   System.out.println(ll.get(i));
		   }
		   for (Object aa:ll)
		   {
			   System.out.println(aa);
		   }
		   

	}

}
