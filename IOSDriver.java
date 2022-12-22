package day45;

public class IOSDriver implements MobileDriver {

	@Override
	public void startApp(String appName) {
		System.out.println("Open app in ios: " + appName);
		
	}

	@Override
	public void clickOnBtn(String btnName) {
		System.out.println("Click on ios: " + btnName);
		
	}

	@Override
	public void tapOnScreen(int x, int y) {
		System.out.println("Tap on ios: x=" + x + "y=" + y);
		
	}

	@Override
	public void swipeScreen(int xInit, int yInit, int xTarget, int yTarget) {
		System.out.println("Swipe screen on ios");
		
	}

	@Override
	public String readText(String elementName) {
		System.out.println("Reading in ios text of " + elementName);
		return "welcome to homepage";
	}

	@Override
	public void insertText(String elementName, String txt) {
		System.out.println("Insert text in ios");
		
	}

	@Override
	public void closeApp(String appName) {
		System.out.println("Closing app in ios");
		
	}

}