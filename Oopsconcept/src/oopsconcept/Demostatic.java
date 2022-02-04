package oopsconcept;

public class Demostatic {
	void outerHello()
	{
		System.out.println("my class1");
		
	}
static class InnerDemo{
	int x=100;
	void innerHello()
	{
		Demostatic obj=new Demostatic();
		obj.outerHello();
		System.out.println("myinnerclass1");
	}
}
void demoMethod() {
	System.out.println("DemoMethod");
	InnerDemo obj=new InnerDemo();
	obj.innerHello();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demostatic.InnerDemo obj1=new Demostatic.InnerDemo();
obj1.innerHello();
	}

}
