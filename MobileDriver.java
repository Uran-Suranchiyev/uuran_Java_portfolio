package day45;

public interface MobileDriver {
	
	// all method in the interface are public by default
	public abstract void startApp(String appName);
	public abstract void clickOnBtn(String btnName);
	public abstract void tapOnScreen(int x, int y);
	public abstract void swipeScreen(int xInit, int yInit, int xTarget, int yTarget);
	public abstract String readText(String elementName);
	public abstract void insertText(String elementName, String txt);
	public abstract void closeApp(String appName);
}