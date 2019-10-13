package excelReader.excelReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class excelDataProviderTest {
	
	
	@Test(dataProvider="dataProviderMethod")
	public void readingExcelData(Integer empId,String name, String skills, Integer age)
	{
		System.out.println(empId+" "+name+" "+skills+" "+age);
	}
	
	@DataProvider
	public Object[][] dataProviderMethod() throws IOException {
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\Deepak\\Desktop\\CapGemini\\Book1.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();
		
		System.out.println(rows+" "+cols);
		Object[][] excelMatrix = new Object[rows-1][cols];

		for (int i = 1; i < rows; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < cols; j++) {
				XSSFCell cell = row.getCell(j);
				
				if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
					excelMatrix[i-1][j] = cell.getStringCellValue();
				} else
					excelMatrix[i-1][j] = (int)cell.getNumericCellValue();

				//System.out.println(excelMatrix[i-1][j]);
				//System.out.println(excelMatrix[i-1][j].getClass().getName());
				
				}
		}
		
		fis.close();
		
		return excelMatrix;

	}

}
