package day19;
// uran ururan uran 
public class DayOfWeek {
	
	public static void main(String[] args) {
		printDayMsg(Day.Mon);
		printDayMsg(Day.Tue);
		printDayMsg(Day.Wed);
		printDayMsg(Day.Thur);
		printDayMsg(Day.Fri);
		printDayMsg(Day.Sat);
		printDayMsg(Day.Sun);
	}
	
	/*
	 * Based on the day print following messages:
	 * Mon - Homework day!
	 * Tue - Study day!
	 * Wed - Relaxing day!
	 * Thur - Study day!
	 * Fri - Coding day!
	 * Sat - Java epic day!
	 * Sun - Kahoot day! 
	 */
	public static void printDayMsg(Day day) {
		if(day == Day.Mon) {
			System.out.println("Homework day!");
		} else if(day == Day.Tue || day == Day.Thur) {
			System.out.println("Study day!");
		} else if(day == Day.Wed) {
			System.out.println("Relaxing day!");
		} else if(day == Day.Fri) {
			System.out.println("Coding day!");
		} else if(day == Day.Sat) {
			System.out.println("Java epic day!");
		}else if(day == Day.Sun) {
			System.out.println("Kahoot day!");
		} else {
			System.out.println("Undefined day");
		}
	}
}
