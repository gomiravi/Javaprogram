package SampleInterface;

public class InterDemo implements I1,I2 {

	public InterDemo()
	{
		this.defmethod();
		
	}
public void show() {
	System.out.println("Method overriding is here");
}
static void staticdemo() {
	I2.display();
}
}


