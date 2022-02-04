package png_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class MainCollection {

	public static void main(String[] args) {
		BeanClass bean=new BeanClass("red","Zara",1200.56);
		BeanClass bean1=new BeanClass("blue","arrow",1245.56);
		BeanClass bean2=new BeanClass("black","guess",17000.56);
ArrayList<BeanClass> al=new ArrayList<BeanClass>();
al.add(bean);
al.add(bean1);
al.add(bean2);

Collections.sort(al);
for(BeanClass obj:al)
{
	System.out.println("Brand :: "+obj.getBrand());
	System.out.println("Price :: "+obj.getPrice());
	System.out.println("color :: "+obj.getColor());
	System.out.println(" "+obj);

}


	}
}
