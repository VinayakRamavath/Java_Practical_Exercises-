import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PE22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar calendar = Calendar.getInstance();

		calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

		DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
		System.out.println(df.format(calendar.getTime()));
		calendar.add(calendar.DATE, 6);

		System.out.println(df.format(calendar.getTime()));
	}

}
