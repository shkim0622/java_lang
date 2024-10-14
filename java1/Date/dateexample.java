import java.util.Date;
import java.text.SimpleDateFormat;

public class dateexample	{
	public static void main(String[] args)	{
		
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sd =new SimpleDateFormat ("yyyy년 MM월  dd일 hh시 mm분 ss초");
		String strNow = sd.format(now) ;// format으로 문자열을 받는다

		System.out.println(strNow);
	}

}

