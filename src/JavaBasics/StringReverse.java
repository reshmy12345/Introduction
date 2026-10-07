package JavaBasics;

public class StringReverse {

	public static void main(String[] args) {
		
		//using for loop
		
		String str="Selenium";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);

		
		//using StringBuilder & reverse()
		/*
		String reverse=new StringBuilder(str).reverse().toString();
		System.out.println(reverse);
		*/
		
		//using character array
		/*String str="Selenium";
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		*/
	}

}
