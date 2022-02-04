package oopsconcept;

public class ConstructorDemo {

	public ConstructorDemo() {
		// TODO Auto-generated constructor stub
		//System.out.println("Default Constructor");
		}
		
		//Parameterized
		
		public ConstructorDemo(int x)
		{
			System.out.println("Parametrized & value is::"+x);
			
		
		}
		
		
		public static void main(String[] args) {
			
			
			 new ConstructorDemo(34);
			 new ConstructorDemo(1);
		}

	
	}

