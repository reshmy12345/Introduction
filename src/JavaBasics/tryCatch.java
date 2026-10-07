package JavaBasics;

public class tryCatch {

	public static void main(String[] args) {
		try
		{
			int result=10/2;
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
		//finally block will be executed irrespective of exception thrown or not. User for cleanup activities before program exit
		//Delete cookies, Closing files , closing database connection, browser close
		finally
		
		{
			System.out.println("Finally block executed");
		}
		//If we forcefully stop the JVM, the finally block will not execute

	}

}
