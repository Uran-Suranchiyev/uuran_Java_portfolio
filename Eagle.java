package day45;

public class Eagle implements AnimalInterface, CanFly {

	@Override
	public void eat() {
		System.out.println("Eagle is eating");
		
	}

	@Override
	public void sleep() {
		System.out.println("Eagle is sleeping");
	}
	@Override
	public void fly() {
		System.out.println("Eagle is flying");
	}
}
