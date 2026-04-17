package oops.abstraction;

public class EdgeBrowser implements WebBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void launch() {
		// TODO Auto-generated method stub
		System.out.println("Edge is Launched");
	}

	@Override
	public void urlPass() {
		// TODO Auto-generated method stub
		System.out.println("Edge url is Passed");
	}

	@Override
	public void minimize() {
		// TODO Auto-generated method stub
		System.out.println("Edge is minimized");
	}

	@Override
	public void maximize() {
		// TODO Auto-generated method stub
		System.out.println("Edge is maximized");
	}

	@Override
	public void newTab() {
		// TODO Auto-generated method stub
		System.out.println("Edge  newTab is opened");
	}

}
