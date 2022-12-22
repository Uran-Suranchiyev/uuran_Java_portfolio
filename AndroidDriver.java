package day45;

public class AndroidDriver implements MobileDriver {
	@Override
	public void startApp(String appName) {
		System.out.println("Open app in android: " + appName);
	}
	
	@Override
	public void clickOnBtn(String btnName) {
		System.out.println("Click on android: " + btnName);
	}
	
	@Override
	public void tapOnScreen(int x, int y) {
		System.out.println("Tap on android: x=" + x + "y=" + y);
	}
	
	@Override
	public void swipeScreen(int xInit, int yInit, int xTarget, int yTarget) {
		System.out.println("Swipe screen on android");
	}
	
	@Override
	public String readText(String elementName) {
		System.out.println("Reading in android text of " + elementName);
		return "welcome to homepage";
	}
	
	@Override
	public void insertText(String elementName, String txt) {
		System.out.println("Insert text in android");
	}
	
	@Override
	public void closeApp(String appName) {
		System.out.println("Closing app in anrdoid");
	}
}