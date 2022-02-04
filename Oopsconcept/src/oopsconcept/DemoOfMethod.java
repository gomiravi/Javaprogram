package oopsconcept;

public class DemoOfMethod {
	
	String email = "abc";
	
	//taking something, returning something
	
	public String display1(String name)
	{
		String s = "Welcome "+name;
		
		return s;
	}
	
	//taking something, returning nothing
	
	public void display2(long contact)
	{
		System.out.println("My Contact number is ::"+contact);
	}

	//taking nothing, returning something
	
	public String display3()
	{
		String em = email+"@gmail.com";
		return em;
	}
	
	//taking nothing, returning nothing
	
	public void display4() {
		System.out.println("My Details::");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoOfMethod obj = new DemoOfMethod();
		obj.display4();
		String s = obj.display1("Sipika");
		System.out.println(s);
		obj.display2(94783024);
		String e = obj.display3();
		System.out.println(e);
		
		
		

	}

}