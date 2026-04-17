package oops.encap;

public class EncapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo encap = new Demo();
		encap.empName("Ram");
		encap.empAdd("Chennai");
		encap.empID("INFO002");
		System.out.println(encap.empName());
		System.out.println(encap.empID());
		System.out.println(encap.empAdd());
	}

}
