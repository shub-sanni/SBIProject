package Smoketestcase;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Allpages.loginPage;
import BaseP.BaseC;

public class Excelreadyandwriting extends loginPage
{
	public static void main(String[] args) 
	{
		String emailid = "";
		String password = "";
		try
		{
		String path = "C:\\Users\\ADMIN\\Desktop\\April-2025\\Autoit\\testdata.xlsx";
		FileInputStream fs = new FileInputStream(path);
		//we are giving path to ready the file
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		//to identify the sheet..for index u can use getSheetAT(index) index starts from 0
		//to get count rows
		//sheet.getLastRowNum() to get count of row and starts with 0
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			emailid=	sheet.getRow(i).getCell(0).getStringCellValue();
			password=	sheet.getRow(i).getCell(1).getStringCellValue();
			browserInitzation(BaseC.browser,BaseC.URL);

			Enter_email(emailid,loginPage.EMailInput);
			Enter_password(password,loginPage.EMailpassword);
			Button_login();
			String expectedtitle="welcome to FB page";
			String actualtitle=driver.getTitle();
			
			int cellCount = sheet.getRow(i).getLastCellNum();
			XSSFCell cell = sheet.getRow(i).createCell(cellCount);
			if(expectedtitle.equals(actualtitle))
			{
				//write as pass in excel
				cell.setCellValue("pass");
			}
			else
			{
				//write as fail in excel
				cell.setCellValue("fail");
			}
			browser_Close();			
		}
		fs.close();
		FileOutputStream fout = new FileOutputStream(path);
		workbook.write(fout);

		fout.close();
		}
		catch(Exception E)
		{
			
		}
	
	}

}
