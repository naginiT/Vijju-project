package Execute;


import org.testng.annotations.Test;

import Operation.Login_operation;
import Operation.Login_readexceloperation;

import Repository.Browserreadexcel;

public class Executionreadexcel {
	@Test
	public void perform() throws Exception
	{
		Browserreadexcel.open();
		Browserreadexcel.opennn();
		Login_readexceloperation.vijju();

	}

}


