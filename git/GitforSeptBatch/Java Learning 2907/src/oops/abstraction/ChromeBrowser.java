package oops.abstraction;

public class ChromeBrowser implements WebBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void launch() {
		// TODO Auto-generated method stub
		System.out.println("Chrome is Launched");
	}

	@Override
	public void urlPass() {
		// TODO Auto-generated method stub
		System.out.println("Chrome url  Passed");
	}

	@Override
	public void minimize() {
		// TODO Auto-generated method stub
		System.out.println("Chrome is minimized");
	}

	@Override
	public void maximize() {
		// TODO Auto-generated method stub
		System.out.println("Chrome is Maximized");
	}

	@Override
	public void newTab() {
		// TODO Auto-generated method stub
		System.out.println("Chrome new Tab is opened");
	}

}
