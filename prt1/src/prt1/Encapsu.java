package prt1;
public class Encapsu {
	private int a;
public void seta(int b) { //setters method
		a=b;
		}
	public int  geta() { //getters method
			return a;
	}
	public static void main(String[] args) {
		
		Encapsu c= new Encapsu();
		c.seta(111);
		//System.out.println(c.getEmp_id());
		int e=c.geta();
		System.out.println(e);
	}

}