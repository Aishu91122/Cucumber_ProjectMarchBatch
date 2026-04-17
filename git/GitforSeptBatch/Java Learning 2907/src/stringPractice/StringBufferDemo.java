package stringPractice;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb1 = new StringBuffer("TestNG");
		
		StringBuffer sb2 = new StringBuffer("Jira");
		
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		System.out.println(sb1.length());
		System.out.println(sb1.append(sb2));
		System.out.println("After Changes "+sb1);
		System.out.println(sb1.reverse());
		System.out.println();
//		System.out.println(sb1.reverse());
//		System.out.println(sb1.charAt(5));
//		System.out.println(sb1.indexOf("Te"));
//		System.out.println(sb1.lastIndexOf("st"));
//		System.out.println(sb1);
		
		

	}

}
