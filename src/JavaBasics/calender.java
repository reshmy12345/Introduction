package JavaBasics;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calender {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sdf= new SimpleDateFormat("MM/d/YYYY");
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));

	}

}
