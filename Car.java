package day52;
// uran uran uran
public class Car {
	public String model;
	public String color;
	public int year;
	
	public Car(String model, String color, int year) {
		this.model = model;
		this.color = color;
		this.year = year;
	}
	
	public void drive() {
		System.out.println(color + " model " + model + " is driving" );
	}
}
