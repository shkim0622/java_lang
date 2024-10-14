import java.util.Calendar;


public class calendarexample	{
	public static void main(String[] args)	{
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);

		System.out.println(year+"년");
	}
}

