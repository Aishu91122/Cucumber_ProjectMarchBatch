package oops.abstraction;

public class FireFoxBrowser implements WebBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void launch() {
		// TODO Auto-generated method stub
		System.out.println("FireFox is Launched");
	}

	@Override
	public void urlPass() {
		// TODO Auto-generated method stub
		System.out.println("FireFox url passed");
	}

	@Override
	public void minimize() {
		// TODO Auto-generated method stub
		System.out.println("FireFox is minimized");
	}

	@Override
	public void maximize() {
		// TODO Auto-generated method stub
		System.out.println("FireFox is maximized");
	}

	@Override
	public void newTab() {
		// TODO Auto-generated method stub
		System.out.println("FireFox new Tab is opened");
	}

}
