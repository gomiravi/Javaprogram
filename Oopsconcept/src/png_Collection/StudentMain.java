package png_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
	
	public static void main(String [] args) {
		ArrayList<Bean_Class2> arr=new ArrayList<Bean_Class2>();
		arr.add(new Bean_Class2(202,"Gomathi",354687989));
		arr.add(new Bean_Class2(798,"Sweety",354687989));
		arr.add(new Bean_Class2(123,"Priya",354687989));
		arr.add(new Bean_Class2(452,"Adhi",354687989));

		
		Collections.sort(arr, new StudentComparator());
		for(Bean_Class2 b: arr)
		{
			System.out.println(b.getName()+"  "+b.getContact()+"  "+b.getId());
		}
	}

}
