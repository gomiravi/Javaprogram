package oopsconcept;

public class VariableScope {
	
	int a = 100; //class variable
	
	static int x = 10; //static variable
	
	void show() {
		int b = 30; //local variable
		System.out.println(a+b);
		System.out.println(x);
	}
	
	static void display() {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		VariableScope obj = new VariableScope();  //Instance Variable
		System.out.println(obj.a);
		display();
		obj.show();
		
	}
	

}