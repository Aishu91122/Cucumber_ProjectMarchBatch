package cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumDemo {

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
		   Enumeration<Object> ve = vv.elements();
		   while(ve.hasMoreElements())
		   {
			   System.out.println(ve.nextElement());
		   }
		   

	}

}
