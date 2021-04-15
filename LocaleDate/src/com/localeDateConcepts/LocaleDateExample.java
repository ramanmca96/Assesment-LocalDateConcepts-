package com.localeDateConcepts;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocaleDateExample {

	public static void main(String[] args) {

		LocalDate local = LocalDate.now();

		System.out.println("Today Date is :" + local);

		LocalDate fixdate = LocalDate.of(2021, 04, 15);

		System.out.println(fixdate.plusYears(7));

		LocalDate parseDate = LocalDate.parse("2020-03-18", DateTimeFormatter.ISO_DATE);

		LocalDate parsedated = LocalDate.parse("2020-03-18");
		System.out.println(parsedated);
		
		

		LocalDateTime localtime = LocalDateTime.of(1995, 9, 30, 06, 00);
		System.out.println("Adding days from given date & time " + localtime.plusDays(8).plusMonths(3));

		LocalDateTime localtime1 = LocalDateTime.of(1993, 5, 30, 06, 00);
		System.out.println("Adding months from given date & time " + localtime1.plusMonths(3));

		LocalDateTime localtime2 = LocalDateTime.parse("1997-07-30T06:00", DateTimeFormatter.ISO_DATE_TIME);
		System.out.println("Formatter " + localtime2);
	}
}
