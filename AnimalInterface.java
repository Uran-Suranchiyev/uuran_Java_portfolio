package day45;

public interface AnimalInterface {
	public static final int MAX_AGE = 100;
	public static final int MIN_AGE = 1;
	String TYPE = "mammal";
	
	public abstract void eat();
	public abstract void sleep();
	
	public static void printInFormat(String animalName) {
		System.out.println("Animal's name is  " + animalName);
	}
	
	public default void run() {
		System.out.println("Animal is running");
	}
}
