package JavaBasics;

public class constructor {
	
	
	public constructor()
	{
		System.out.println("This is constructorDemo");
	}
	
	public constructor(int a, int b)
	{
		System.out.println("This is parametrised constructorDemo");
	}
	
	//constructor will not return any values
	//name of constructor should be same as class
	//when you create an object constructor is called

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor cd= new constructor();
		constructor c= new constructor(2,3);

	}

}
