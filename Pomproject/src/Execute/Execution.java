package Execute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Operation.Login_operation;
import Repository.Browser;
import Repository.Browserreadexcel;

public class Execution {
	
	@Test
	public void perform() throws Exception
	{
		Browser.open();
		
		Login_operation.show();
	}

}