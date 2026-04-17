package collectionList;

import java.util.Vector;

public class VectorDemo {

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
		   vv.add(8876.78d);
		   vv.add(6.75f);
		   vv.add("Welcome");
		   vv.add(null);
		 System.out.println(vv);
		 vv.add(1, "Selenium");
		 System.out.println(vv);
		 vv.remove(10);
		 System.out.println(vv);
		 System.out.println(vv.size());
		 System.out.println(vv.get(8));
		 System.out.println("====================");
		 for (int i=0; i<=vv.size()-1; i++)
		 {
			 System.out.println(vv.get(i));
		 }
		 for (Object aa:vv)
		 {
			 System.out.println(aa);
		 }

	}

}
