package day45;

public class AbstractDemo {
	public static void main(String[] args) {
		Falcon obj = new AmurFalcon();
		obj.age = 2;
		obj.hunt();
		obj.printDetails();
		System.out.println("-------------");
		Mammal bull = new Ox();
		bull.animal = "ox";
		bull.breathe();
		bull.move();
		bull.eat();
		bull.suckMilk();
	}
}
