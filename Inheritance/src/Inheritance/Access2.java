package Inheritance;

public class Access2 extends Access1 {
	private void msg()
	{
		System.out.println("java language");
		}  
	

	public static void main(String[] args) {
		
		Access1 obj=new Access1();
		obj.msg1();
		obj.msg2();
		obj.msg3();
		Access2 obj1=new Access2();
		obj1.msg();
	}

}
