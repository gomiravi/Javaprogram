package exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.RemoteException;

public class ThrowsExample {
	public void m() throws IOException,RemoteException,Exception
	{
		InputStreamReader r=new InputStreamReader(System.in);
				BufferedReader brr=new BufferedReader(r);
		System.out.println("Enter Input");
		String name=brr.readLine();
		System.out.println("Methd1");
		
				
	}
	public void n() {
		try {
			m();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		ThrowsExample obj=new ThrowsExample();
		obj.n();
	}

}
