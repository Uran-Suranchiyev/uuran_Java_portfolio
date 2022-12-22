package day45;

public abstract class Falcon extends Bird {
	public int age;
	public abstract void hunt();
	public void printDetails() {
		System.out.println("Falcon details");
		System.out.println(age);
	}
}
