package abstractmethod;

public  class CircleArea extends Shape{
	

	@Override
	void area(int x, int y) {
		
		  
		  int a1=x*y;
		  System.out.println("Area of Circle is: "+a1);
		 }
		
	

	@Override
	void volume(int x, int y, int z) {
		// TODO Auto-generated method stub
		
	}
	void show() {
		System.out.println("circle");
	}
	}


