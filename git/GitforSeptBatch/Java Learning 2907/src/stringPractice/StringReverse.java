package stringPractice;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "JavaMyLanguage";
		
		for (int i=0; i<s.length(); i++)
		{
			System.out.print(s.charAt(i));
		}
		
		
		
		for (int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
		
		

	}

}
