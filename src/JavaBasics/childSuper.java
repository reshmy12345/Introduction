package JavaBasics;

public class childSuper extends parentSuper{
	
	String name="Selenium";
	
	public childSuper()
	{
		super();
			System.out.println("This is child class constructor");
	}
	public void getData()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	public void getStringData()
	{
		
		System.out.println("I am in child class");
		super.getStringData();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childSuper cd=new childSuper();
		cd.getData();
		cd.getStringData();

	}

}
