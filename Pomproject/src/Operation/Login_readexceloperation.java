package Operation;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import Repository.Inspectelementreadexcel;

public class Login_readexceloperation {
	
	
	
	
	
	public static void vijju() throws Exception
	{
		FileInputStream fis=new FileInputStream("D:\\vijaylaxmi\\readexcel.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(fis);
    //    XSSFWorkbook workbook=new XSSFWorkbook(fis);
        XSSFSheet s=w.getSheetAt(0);
        XSSFCell cell ;
        Inspectelementreadexcel.signin().click();
       
        for(int i=1;i<=s.getLastRowNum();i++)
        {
        	cell=s.getRow(i).getCell(0);
        	Inspectelementreadexcel.login().sendKeys(cell.getStringCellValue());
        	cell=s.getRow(i).getCell(1);
        	cell.setCellType(cell.CELL_TYPE_STRING);
            String data=cell.getStringCellValue();
            System.out.println("data on excel "+data );
            Inspectelementreadexcel.password().sendKeys(cell.getStringCellValue());
            Inspectelementreadexcel.submit().click();
            
        	
        	
    			

        	
        	}
        
        
  		  
          

	

	}
       // Inspectelementreadexcel.login();
        
}

