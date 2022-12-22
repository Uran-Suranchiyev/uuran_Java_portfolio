package day50;

public class ExceptionsReview {
	public static void main(String[] args) {
		try {
			String str = "Hello world";
			System.out.println(str.substring(0, 20));
			System.out.println("code is done");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("exception is handled: " + e.getMessage());
		}// finally {
//			System.out.println("finally");
//		}
		System.out.println("code is continue");
		
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
			try {
				waitSec(5);
			} catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	public static void waitSec(int sec) throws InterruptedException {
		Thread.sleep(1000 * sec);
	}
}
