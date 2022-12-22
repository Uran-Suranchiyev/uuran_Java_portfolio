package day52;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("Tesla", "white", 2019));
		cars.add(new Car("Tesla", "black", 2022));
		cars.add(new Car("BMW", "white", 2018));
		cars.add(new Car("BMW", "red", 2017));
		cars.add(new Car("Audi", "blue", 2022));
		
		TestDrive.testDrive(cars, (Car car) -> {
			return car.model.equals("Tesla");
		});
		System.out.println("---");
		
		TestDrive.testDrive(cars, (Car car) -> {
			return car.color.equals("white");
		});
		System.out.println("---");
		
		TestDrive.testDrive(cars, (Car car) -> {
			 return car.year > 2018;
		});
		System.out.println("---");
		
		
		TestDrive.printDetails(cars, (Car car) -> {
			String m = car.model;
			String c = car.color;
			int y = car.year;
			return String.format("{model=%s, color=%s, year=%d", m, c, y);
		}); // TODO
	}
}