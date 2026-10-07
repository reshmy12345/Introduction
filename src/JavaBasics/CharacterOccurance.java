package JavaBasics;
import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {

	public static void main(String[] args) {
		String str="automation";
		char target='a';
		Map<Character,Integer>map=new HashMap<>();
		
		for(char ch: str.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println("Occurance of" + " "+target +"="+map.get(target));
		//for all character occurance
		System.out.println(map);

	}

}
