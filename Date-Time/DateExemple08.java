import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExemple08 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); //formatting date in text
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = sdf1.parse("18/12/2023"); //parsing text in date
		Date y2 = sdf1.parse("18/12/2023 09:22:07");
		
		System.out.println(y1);
		System.out.println(y2);
		
	}
	}
