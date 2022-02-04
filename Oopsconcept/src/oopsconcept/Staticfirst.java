package oopsconcept;

import static java.lang.System.out;

public class Staticfirst {
	 String s2;
	 String s1;
	final static int x;

	static {
		x=100;
		out.println("Static block "+ x);
	}
	
	
	
	public Staticfirst(String s1, String s2)
	{
		this.s1 = s1;
	this.s2 = s2;
		
	}
	 static void display()
	 {
		out.println();
	}

	void show()
	{
	
		out.println(s2+" is a "+s1);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Staticfirst obj=new Staticfirst("Programming Language","java");
	Staticfirst obj1=new Staticfirst("PL","Phyton");
	obj1.show();
       obj.show();
      display();
	

	}

}
