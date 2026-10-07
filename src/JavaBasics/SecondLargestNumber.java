package JavaBasics;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] arr= {2,4,7,8,1};
        Integer largest=null;
        Integer secondlargest=null;
        
        for(int num :arr)
        {
        	if(largest==null || num>largest)
        	{
        		secondlargest=largest;
        		largest=num;
        	}
        	else if(secondlargest==null || num>secondlargest &&num!=largest)
        	{
        		secondlargest=num;
        	}
        }
        if (secondlargest!=null)
        {
            System.out.println("Secondlargest Number is"+ " "+ secondlargest);
        }
        System.out.println("Largest Number is"+" "+largest);
		

	}

}
