package exceptionHandling;

public class TryCatchexample {
	int var=100;
	TryCatchexample obj;
	public TryCatchexample(String msg)
	{
		try
		{
			System.out.println(obj.var);
			
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		
	}
	public static void main(String[] args)
	{
		TryCatchexample obj1=new TryCatchexample("abc");
		int a=10;
	try	{
		int x=a/0;
		
	}catch(ArithmeticException e) {
		System.out.println(e);
	}
	System.out.println("End of programm");
	}

}
