package timeanddate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTime {

	
	public static void main(String[] args) {
	LocalDateTime dt = LocalDateTime.now();
	LocalDate od = LocalDate.now();
	LocalTime ot = LocalTime.now();
	
	System.out.println("Both date and time "+dt);
	System.out.println("Only for date "+dt);
	System.out.println("Only for time "+dt);
	
	
	
	}
}
