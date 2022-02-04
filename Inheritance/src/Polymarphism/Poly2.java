package Polymarphism;

public class Poly2 extends Ploy1 {
	String contect;
 void poly2(String name,String course,String contect)
	{	
		super.Poly1(name,course);
		this.contect=contect;
		System.out.println("Your Nmae is: "+name);
		System.out.println("Your Course is: "+course);
		System.out.println("Your Contect is: "+contect);



	}

	
void getdata(int m1,int m2,int total) {
	super.getdata(m1,m2);
	total=m1+m2;
	System.out.println("your Total mark is:"+total);

	
	
}
void display(int rollno) {
	super.display(rollno);
	System.out.println("Your Rollno is: "+rollno);


}
}
	