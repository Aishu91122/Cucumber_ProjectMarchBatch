package collectionList;

import java.util.ArrayList;

public class Sample {

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
	   al.add(8876.78d);
	   al.add(6.75f);
	   al.add("Welcome");
	   al.add(null);
	   System.out.println(al);
	   al.add(5, 7.8f);                //inbuilt methods add, add, remove, size, get
	   System.out.println(al);
	   al.remove("Java");
	   System.out.println(al);
	   System.out.println(al.size());
	   System.out.println("5th element of ArrayList "+al.get(5));
	   System.out.println("===========================");
	   for (int i=0; i<=al.size()-1; i++)
	   {
		   System.out.println(al.get(i));
	   }
	   System.out.println("============================");
	   for (Object aa:al)
	   {
		   System.out.println(aa);
	   }
	   
		
	  
		

	}

}
