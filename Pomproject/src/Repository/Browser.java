package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public static WebDriver driver;
	public static void open()
	{
		System.setProperty("webdriver.firefox.marionette","D:\\vijaylaxmi\\drivers\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://matrimony.cubicitsolution.com/");
	}

}
