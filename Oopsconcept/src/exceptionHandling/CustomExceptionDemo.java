package exceptionHandling;

public class CustomExceptionDemo {
	public static void validForVote(int age)throws MyException
	{
		if(age<18)
		{
			throw new MyException("NotValidForVote");
		
		}
	}
	
public static void main(String[] args)throws MyException{
	validForVote(10);
}
}