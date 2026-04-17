package oops.polymorphism;

public class FireFoxBrowser extends WebBrowser  {
	
	public void launch()
	{
		System.out.println("FireFox Browser Launched");
	}
	public void urlPass()
	{
		System.out.println("URL passed in FireFox Browser");
	}
	
	public void minimize()
	{
		System.out.println("FireFox Browser MiniMized");
	}
	public void maximize()
	{
		System.out.println("FireFox Browser Maximized");
	}
	public void newTab()
	{
		System.out.println("new Tab in FireFox Browser");
	}
	public void back()
	{
		System.out.println("FireFox Browser gone back");
	}
	public void forward()
	{
		System.out.println("FireFox Browser gone Forward");
	}
	public void refresh()
	{
		System.out.println("FireFox Browser refreshed");
	}
	public void close()
	{
		System.out.println("FireFox Browser Closed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
