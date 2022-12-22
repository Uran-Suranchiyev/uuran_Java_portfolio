package day52;

import java.util.List;
//uran
public class TestDrive {
	public static void testDrive(List<Car> cars, CarTester carTester) {
		for (Car car : cars) {
			if (carTester.test(car)) {
				car.drive();
			}
		}
	}
	
	public static void printDetails(List<Car> cars, CarDetails carDetails) {
		for (Car car : cars) {
			System.out.println(carDetails.getDetails(car)); // TODO
		}
	}
//	public static void testDriverNew(List<Car> cars, Predicate<Car> predicate) {
//		for (Car car : cars) {
//			if (predicate.test(car))
//		}
//	}
}
