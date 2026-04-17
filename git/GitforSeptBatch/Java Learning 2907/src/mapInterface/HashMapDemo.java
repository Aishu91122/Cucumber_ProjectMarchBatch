package mapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Ram");
		hm.put(2, "Ram");
		hm.put(3, "Ravi");
		hm.put(4, "Rahul");
		hm.put(5, "Ragav");
		hm.put(6, "Raj");
		hm.put(7, "Raja");
		hm.put(8, "Rama");
		hm.put(9, "Ravin");
		hm.put(10,"Ragu");
		hm.put(11,null);
		hm.put(null,"Rajam");
		hm.put(13,null);
		System.out.println(hm);
		Set<Integer> keys = hm.keySet();
		
		for (Integer aa:keys)
		{
			System.out.println(aa);
		}
		
		
		Iterator<Integer> keysi = keys.iterator();
		while (keysi.hasNext())
		{
			System.out.println(keysi.next());
		}
		System.out.println("=============================");
		
		
		
		Collection<String> values = hm.values();
		
		for (String aa:values)
		{
			System.out.println(aa);
		}
		
		
		
		
		Iterator<String> valuesi = values.iterator();
		while(valuesi.hasNext())
		{
			System.out.println(valuesi.next());
		}
		System.out.println("============================");
		Set<Entry<Integer, String>> entries = hm.entrySet();
		Iterator<Entry<Integer, String>> entriesi = entries.iterator();
		while(entriesi.hasNext())
		{
			//float    b = (float)    a;   TypeCasting Syntax
			Map.Entry me = (Map.Entry)entriesi.next();
			System.out.println(me.getKey()+ " ---> " +  me.getValue());
		}
		
		

}

}
