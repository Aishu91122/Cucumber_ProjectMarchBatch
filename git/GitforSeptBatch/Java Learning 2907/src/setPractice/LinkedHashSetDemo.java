package setPractice;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>() ;
		lhs.add(88);
		lhs.add("Java");
		lhs.add("Developer");
		lhs.add(2346473754l);
		lhs.add(6.3f);
		lhs.add(true);
		lhs.add('u');
		lhs.add(null);
		lhs.add("JavaPython");
		lhs.add(56);
		lhs.add("JavaPython");
		lhs.add(null);
		System.out.println(lhs);
		System.out.println(lhs.size());
		lhs.add("Selenium");
		lhs.remove("Developer");
		System.out.println(lhs);
		for (Object aa:lhs)
		{
			System.out.println(aa);
		}

	}

}
