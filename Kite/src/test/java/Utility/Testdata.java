package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Testdata {
	
	public static Workbook OpenWorkbook() throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("F:\\Password\\pass.xlsx\\");
		Workbook a = WorkbookFactory.create(file);
		return a;
	}
	public static String fetchData(Workbook a ,String sheet, int r,int c) 
	{
		String value= a.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
		
		
		return value;

	}

}
