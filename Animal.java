package day45;

public abstract class Animal {
	public String animal;
	
	public void breathe() {
		System.out.println(animal + " is breathind");
	}
	public abstract void move();
	public abstract void eat();
}
