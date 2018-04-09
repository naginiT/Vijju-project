package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Inspectelement extends Browser {
	static By signin=By.cssSelector(".sign-in");
	static By login=By.name("login");
	static By password=By.id("top-area-password");
	static By submit=By.id("top-area-button-submit");
	static WebElement element=null;
	public static WebElement signin() throws Exception
	{
	element=driver.findElement(signin);
	Thread.sleep(3000);
	return element;
	}
	public static WebElement  login() throws Exception {
		element=driver.findElement(login);
	Thread.sleep(3000);
	return element;
	}
	public static WebElement  password() throws Exception {

		element=driver.findElement(password);
Thread.sleep(3000);
return element;
	}
	public static WebElement submit() throws Exception {
		element=driver.findElement(submit);
Thread.sleep(3000);
return element;
	}
	

}
