package stringPractice;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = "Selenium";  //Object Creation without new Keyword
		
	    String s2 = "Maven";
	    
	    System.out.println(s1.hashCode());
	    System.out.println(s2.hashCode());
	    System.out.println(s1.length());
	    System.out.println(s1.concat(s2));
	    System.out.println(s1);
	    System.out.println(s2.repeat(10));
	    System.out.println(s2);
	    System.out.println(s1.lastIndexOf('e'));
	    System.out.println(s1.indexOf('e'));
	    System.out.println(s1.startsWith("Se"));
	    System.out.println(s1.contains("ni"));
	    System.out.println(s1.endsWith("mmm"));
	    System.out.println(s2.charAt(2));  //index position
	    System.out.println(s1.toUpperCase());
	    System.out.println(s2.toLowerCase());
	    System.out.println(s1);
	    System.out.println(s2);
	}

}
