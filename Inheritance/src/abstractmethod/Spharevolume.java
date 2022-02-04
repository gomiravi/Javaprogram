package abstractmethod;

public  class Spharevolume extends Shape {

	@Override
	void area(int x, int y) {
		System.out.println("X value is: ");
		  System.out.println("Y value is: ");
		  int a1=x*y;
		  System.out.println("Area of Circle is"+a1);
		 }
		
	

	@Override
	void volume(int x, int y, int z) {
		// TODO Auto-generated method stub
		int  v1=x*y*z;
		  System.out.println("Volume of sphare:"+v1);
		 }
	void show() {
		System.out.println("Sphares");
	}
}