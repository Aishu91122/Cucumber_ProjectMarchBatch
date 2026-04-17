package oops.abstraction;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebBrowser cb = new ChromeBrowser();
		cb.launch();
		cb.maximize();
		
		WebBrowser eb = new EdgeBrowser();
		eb.urlPass();
		eb.maximize();
		
		WebBrowser fb = new FireFoxBrowser();
		fb.minimize();
		fb.newTab();

	}

}
