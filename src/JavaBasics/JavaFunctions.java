package JavaBasics;

public class JavaFunctions {

	public static void main(String[] args) {
		String s= "Selenium Automation Testing";
		String s1=new String ("Selenium Automation Testing");
		String s2= "Selenium Automation Testing";
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(s==s2);
		String[] splitedArray= s.split("Automation");
		System.out.println(splitedArray[0]);
		System.out.println(splitedArray[1]);
		//System.out.println(splitedArray[2]);
		System.out.println(splitedArray[1].trim());
		for (int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
	}

}
