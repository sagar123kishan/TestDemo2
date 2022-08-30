package prt1;

public class Encapsu1 {
	private int a;
	public void set(int b) {
		a=b;}
public int get() {
	return a;
}

public static void main(String[] args) {
	Encapsu1 e= new Encapsu1();
	e.set(10);
	//System.out.println(e.set());
int c	=e.get();
System.out.println(c);
	
}
}
