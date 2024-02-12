package j8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class demo_date {

	public static void main(String[] args) {
		LocalTime lt=LocalTime.now();
		System.out.println("local time"+lt);
		System.out.println(lt.getHour());
		System.out.println(lt.getMinute());
		System.out.println(lt.getSecond());
		System.out.println(lt.getNano());
		
//		System.out.println("hashcode "+lt.hashCode());
		System.out.println("nano second of the day "+lt.toNanoOfDay());
		System.out.println("second of the day "+lt.toSecondOfDay());
		System.out.println("minusing 3 hours "+lt.minusHours(3));
		System.out.println(lt.minusMinutes(10));
		System.out.println(lt.minusSeconds(20));
		System.out.println("plusing 2 hours"+lt.plusHours(2));
		System.out.println(lt.plusMinutes(10));
		System.out.println(lt.plusSeconds(5));
		System.out.println("changing hours "+lt.withHour(3));
		System.out.println(lt.MIDNIGHT);
		System.out.println(lt.ofSecondOfDay(50));
		
		
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		System.out.println(ld.now());
		System.out.println(ld.getDayOfWeek());
		System.out.println(ld.getDayOfYear());
		System.out.println(ld.getEra());
		System.out.println(ld.getMonth());
		
		LocalDate ld1=LocalDate.of(2002, 6, 27);
		System.out.println(ld1.getYear());
		System.out.println(ld1.lengthOfYear());
		
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		System.out.println(ldt.withDayOfYear(5));
		
		Period p=Period.between(ld1, ld);
		System.out.println("age "+p.getYears()+"years "+p.getMonths()+"months "+p.getDays()+"days");
	}

}
