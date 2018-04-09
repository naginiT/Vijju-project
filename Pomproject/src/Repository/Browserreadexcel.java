package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserreadexcel {
	public static WebDriver driver;
	public static void open() throws Exception
	{
		System.setProperty("webdriver.firefox.marionette","D:\\vijaylaxmi\\drivers\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
        public static void opennn() {
    		driver.get("http://matrimony.cubicitsolution.com/#");

        
	}

}
