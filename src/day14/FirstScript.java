package day14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// This line interprets that which browser are we going to use , and where is
		// the location for it
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumBrowserDriversJarFiles\\chromedriver_win32_91\\chromedriver.exe");
		// WebDriver - Interface
		// ChromeDriver - class
		WebDriver driver = new ChromeDriver();
		// chromeDriver gives the implementations of all the methods that have been
		// defined under webDriver Interface
		driver.get("https://www.google.com");
		// This is used to launch the browser
		
	}

}
