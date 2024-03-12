package com.ict.day11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ex20 {
	public static void main(String[] args) {
		// java version 8.0 이상에서만 가능
		// LocalDate = 날짜 정보만
		LocalDate cDate = LocalDate.now();
		System.out.println(cDate);
		
		LocalDate cDate2 = LocalDate.of(2016,04,16);
		System.out.println(cDate2);
		
		// 날짜 비교 
		System.out.println(ChronoUnit.YEARS.between(cDate, cDate2));
		System.out.println(ChronoUnit.MONTHS.between(cDate, cDate2));
		System.out.println(ChronoUnit.DAYS.between(cDate, cDate2));
		
		// LocalTime 시간 정보만
		LocalTime cTime = LocalTime.now();
		System.out.println(cTime);
		
		LocalTime cTime2 = LocalTime.of(17,35);
		System.out.println(cTime2);
		
		// LocalDateTime 날짜 시간 둘 다
		LocalDateTime cdt = LocalDateTime.now();
		System.out.println(cdt);
		LocalDateTime cdt2 = LocalDateTime.of(cDate2, cTime2);
		System.out.println(cdt2);
		
		// plus**(), minus**()
		System.out.println(cdt.plusYears(7));
		System.out.println(cdt.plusMonths(7));
		System.out.println(cdt.plusDays(7));
		System.out.println(cdt.plusHours(7));
		System.out.println(cdt.minusYears(7));
		System.out.println(cdt.minusMonths(7));
		System.out.println(cdt.minusDays(7));
		System.out.println(cdt.minusHours(7));
		
		
		
		
		
		
		
		
		
		
		
	}
}















