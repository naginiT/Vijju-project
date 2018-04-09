package Operation;

import Repository.Inspectelement;
import Repository.Inspectelementreadexcel;

public class Login_operation {
	public static void show() throws Exception
	{
		Inspectelement.signin().click();;
		Inspectelement.login().sendKeys("vasanth@gmail.com");
		Inspectelement.password().sendKeys("1234");
		Inspectelement.submit().click();
		
	}

}
