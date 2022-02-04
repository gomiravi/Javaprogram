package oopsconcept;

public class UseofThis {
	String name;
	

	public UseofThis(String name) {
		this.name = name;
		
	}
	public  UseofThis() {
		System.out.println("Default Running");
		
	}
	public void show()
	{
		System.out.println(name);
		
	}

	public static void main(String[] args) {
		UseofThis obj=new UseofThis("sweety");
		obj.show();
		
		UseofThis obj1=new UseofThis("gomathi");
		obj1.show();
		
		UseofThis obj2=new UseofThis();
		obj2.show();
	}
	}
