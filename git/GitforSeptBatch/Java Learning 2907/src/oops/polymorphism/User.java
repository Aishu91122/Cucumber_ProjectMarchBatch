package oops.polymorphism;

public class User {
	
	
	
	public static void main(int a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebBrowser cb = new ChromeBrowser();
		cb.newTab();
		cb.back();
		cb.minimize();
		cb.forward();
		
		WebBrowser eb = new EdgeBrowser();
		eb.urlPass();
		eb.newTab();
		eb.maximize();
		eb.refresh();
		
		WebBrowser fb = new FireFoxBrowser();
		fb.urlPass();
		fb.forward();
		
		
		
		
		

	}

}
