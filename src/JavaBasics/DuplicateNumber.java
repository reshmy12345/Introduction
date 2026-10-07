package JavaBasics;
import java.util.Set;
import java.util.HashSet;


public class DuplicateNumber {

	public static void main(String[] args) {
		int[] arr= {1,2,4,6,4,6};
		Set<Integer>set= new HashSet<>();
		
		for(int num:arr)
		{
			if(!set.add(num)) {
				System.out.println("Duplicate Number is"+" "+num);
				
			}
		}
		

	}

}
