package constructorPractice;

public class ConsOverloading {
	
	public ConsOverloading()
	{
		this(1.5f);  //can be written only in first line
		System.out.println("I am a Constructor with no arguments");
		
	}
	public ConsOverloading(float a)
	{
		this("Java"); // can be written only in constructor 
		System.out.println("I am a Constructor with float");
	}
	public ConsOverloading(String a)
	{
		this(5397777775l); // this () is used for current class constructor calling statement 
		System.out.println("I am a Constructor with String");
	}
	public ConsOverloading(long a)
	{
		this(true);
		System.out.println("I am a Constructor with Long");
	}
	public ConsOverloading(boolean a)
	{
		this('r');
		System.out.println("I am a Constructor with Boolean");
	}
	public ConsOverloading(char a)
	{
		System.out.println("I am a Constructor with Char");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ConsOverloading();
	
	}

}
