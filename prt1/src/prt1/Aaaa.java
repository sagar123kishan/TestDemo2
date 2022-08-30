package prt1;

public class Aaaa implements Aaa {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3");
	}
void m4() {
	System.out.println("m4");
}
public static void main(String[] args) {
	Aaaa e= new Aaaa();
	e.m1();
	e.m2();
	e.m3();
	e.m4();
	
	Aaa ee =new Aaaa();
	ee.m1();
	ee.m2();
	ee.m3();
	//ee.m4();
}
	
}
