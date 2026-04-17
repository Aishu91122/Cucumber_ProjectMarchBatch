package oops.polymorphism;

public class ChromeBrowser extends WebBrowser {
	
	public  void launch()
	{
		System.out.println("Chrome Browser Launched");
	}
	public void urlPass()
	{
		System.out.println("URL passed in Chrome Browser");
	}
	
	public void minimize()
	{
		System.out.println("Chrome Browser MiniMized");
	}
	public void maximize()
	{
		System.out.println("Chrome Browser Maximized");
	}
	public void newTab()
	{
		System.out.println("new Tab in Chrome Browser");
	}
	public void back()
	{
		System.out.println("Chrome Browser gone back");
	}
	public void forward()
	{
		System.out.println("Chrome Browser gone Forward");
	}
	public void refresh()
	{
		System.out.println("Chrome Browser refreshed");
	}
	public void close()
	{
		System.out.println("Chrome Browser Closed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
