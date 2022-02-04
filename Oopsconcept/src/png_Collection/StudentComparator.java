package png_Collection;

import java.util.Comparator;

public class StudentComparator implements Comparator {
	Bean_Class2 b1,b2;

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		b1=(Bean_Class2)o1;
		b2=(Bean_Class2)o2;
	//	return b1.getId().compareTo(b2.getId());
		
if(b1.getId()==b2.getId())
		{
	return 0;
		}
		else if(b1.getId()>b2.getId())
{
	return 1;
}
else {
	return -1;

}
	}

	}
	


