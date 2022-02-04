package oopsconcept;

public class GetterSetter {
	private double d;
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	private int n;
	private String a;
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public GetterSetter(double d, int n, String a) {
	
		this.d = d;
		this.n = n;
		this.a = a;
	}
	

	
}

