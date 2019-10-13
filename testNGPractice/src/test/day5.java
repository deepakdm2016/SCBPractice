package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day5 {

	
	@Test(dataProvider="dataMethod")
	public void readingExcelData(int empId,String name, String skills, int age)
	{
		System.out.println(empId+" "+name+" "+skills+" "+age);
	}
	
	@DataProvider(name = "dataMethod")
	public Object[][] dataProviderMethod() throws IOException {
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\Deepak\\Desktop\\CapGemini\\Book1.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();
		Object[][] excelMatrix = new Object[rows][cols];

		for (int i = 0; i < rows; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < cols; j++) {
				XSSFCell cell = row.getCell(j);
				
				excelMatrix[i][j]=row.getCell(j).getStringCellValue();
				}
		}
		
		fis.close();
		
		return excelMatrix;

	}

}
