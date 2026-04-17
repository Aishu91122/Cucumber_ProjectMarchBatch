package cursors;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> al = new ArrayList<Object>(); //Object Creation with reference 
		   al.add("Welcome");
		   al.add(78);
		   al.add('r');
		   al.add(70);
		   al.add("Java");
		   al.add(null);
		   al.add("Developers");
		   al.add(45785678567854l);
		  Iterator<Object> ai = al.iterator();
		  while(ai.hasNext())
		  {
			  System.out.println(ai.next());
		  }
		   
		   
		HashSet<Object> hs = new HashSet<Object> ();
			hs.add(88);
			hs.add("Java");
			hs.add("Developer");
			hs.add(2346473754l);
			hs.add(6.3f);
			hs.add(true);
			hs.add('u');
			hs.add(null);
	   Iterator<Object>	si = hs.iterator();	
	   while(si.hasNext())  //False
	   {
		   System.out.println(si.next());
	   }
			

	}

}
