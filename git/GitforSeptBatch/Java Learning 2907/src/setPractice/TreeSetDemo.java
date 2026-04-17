package setPractice;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
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
		ts.add(11);
		ts.add(87);
		System.out.println(ts);
		}
		catch (ClassCastException e)
		{
			System.out.println("Please add elements of same datatype");
		}
		catch (NullPointerException e)
		{
			System.out.println("Please remove null from TreeSet");
		}
		finally
		{
			System.out.println("Always Executable");
		}

	}

}
