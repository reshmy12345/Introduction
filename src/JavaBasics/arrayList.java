package JavaBasics;

import java.util.ArrayList;

//List interface can accept duplicate values
public class arrayList {

	//Array have fixed size where as ArrayList can grow dynamically
	//We can access and insert any value in any index
	
	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList<String>();
		a.add("Automation");
		a.add("Testing");
		a.add("Testing");
		System.out.println(a);
		a.add(0, "Selenium");
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		System.out.println(a.get(0));
		System.out.println(a.contains("Testing"));
		System.out.println(a.indexOf("Testing"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		

	}

}
