package JavaBasics;

public class thisKeyword {

	
	int a= 5;
	public void getData()
	{
		int a=3;
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisKeyword td= new thisKeyword();
		td.getData();

	}

}
