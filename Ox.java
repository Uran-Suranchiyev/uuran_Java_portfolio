package day45;

public class Ox extends Mammal {
	@Override
  public void move() {
	  System.out.println(animal + " is moving");
  }
	@Override
  public void eat() {
	  System.out.println(animal + " is eating");
  }
	@Override
	public void suckMilk() {
		System.out.println(animal + " is sucking milk");
	}
  
}
