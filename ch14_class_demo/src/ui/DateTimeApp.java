package ui;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class DateTimeApp {

	public static void main(String[] args) {
		
		
		//current dates/times
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDate halloween2019 = LocalDate.of(2019, 9, 28);
		System.out.println(halloween2019);
		
		LocalDate xmas2019 = LocalDate.of(2019, 12, 25);
		System.out.println(xmas2019);
		
		LocalDateTime christmas2019 = LocalDateTime.of(2019, 12, 25,0,0,0);
		System.out.println(christmas2019);
		
		
		LocalDateTime test = LocalDateTime.parse("2019-12-25T12:12:12.222");
		
		
		System.out.println(christmas2019.getMonthValue());
		
		
		System.out.println("Compare/Dates/Times");
		System.out.println(halloween2019.isBefore(xmas2019));
		System.out.println(halloween2019.compareTo(xmas2019));
		
		//adjusters
		LocalDate newDate = halloween2019.withMonth(11);
		System.out.println(newDate);
		
		//throws exception
		LocalDate date1 = LocalDate.of(2017, 2, 28);
		
		System.out.println(newDate);
		
		//LocalDate newDate2 = date1.plusYears(2).plusMonths(8).minusDays(6);
		LocalDate newDate2 = date1.plus(32,ChronoUnit.MONTHS);
		System.out.println(newDate2);
		
		DateTimeFormatter df = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(df.format(newDate2));
		
	}

}
