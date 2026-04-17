package setPractice;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Object> hs = new HashSet<Object> ();
		hs.add(88);
		hs.add("Java");
		hs.add("Developer");
		hs.add(2346473754l);
		hs.add(6.3f);
		hs.add(true);
		hs.add('u');
		hs.add(null);
		hs.add("JavaPython");
		hs.add(56);
		
		System.out.println(hs);
		System.out.println(hs.size());
		hs.add("Selenium");
		hs.remove("Developer");
		System.out.println(hs);
		for (Object aa:hs)
		{
			System.out.println(aa);
		}

	}

}
