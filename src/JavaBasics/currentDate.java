package JavaBasics;
import java.text.SimpleDateFormat;
import java.util.Date;

public class currentDate {

	public static void main(String[] args) {
		Date d= new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("MM/d/YYY");
		System.out.println(sdf.format(d));
		System.out.println(d.toString());

	}

}
