package JavaBasics;

public class RevereseEachWord {

	public static void main(String[] args) {
		String str= "Selenium automation testing";
		String[] words=str.split(" ");
		String result="";
		
		for(String word:words)
		{
			String reverse="";
			for(int i=word.length()-1;i>=0;i--)
			{
				reverse=reverse+word.charAt(i);
			}
			result=result+reverse+" ";
		}
		System.out.println(result);

	}

}
