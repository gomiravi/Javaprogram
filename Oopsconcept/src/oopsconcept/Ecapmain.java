package oopsconcept;

public class Ecapmain {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		GetterSetter obj  = new GetterSetter(0, 0, null);
		obj.setN(10);
		obj.setA("ABC");
		obj.setD(78.9);
	
		System.out.println(obj.getN());
		System.out.println(obj.getA());
		System.out.println(obj.getD());
	
	}

}


