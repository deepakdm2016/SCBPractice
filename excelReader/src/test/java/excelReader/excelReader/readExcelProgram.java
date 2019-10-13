package excelReader.excelReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcelProgram {

	public static void main(String[] args) throws IOException {

		File f=new File("C:\\Users\\Deepak\\Desktop\\Edureka_dataScience\\bank-data.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		
		int rows = sh.getPhysicalNumberOfRows();
		int cols=sh.getRow(1).getLastCellNum();
		
		Map<String, Integer> mp=new LinkedHashMap<String, Integer>();
		
		
		for(int i=1;i<rows;i++)
			{
				String role = sh.getRow(i).getCell(1).getStringCellValue();
				if(mp.containsKey(role))
				{
					mp.put(role, mp.get(role)+1);
				}
				else
					mp.put(role, 1);

			}
		
		Set<String> lset = mp.keySet();
		for(String s:lset)
		{
			System.out.println(s+" appears "+mp.get(s)+" times.");
		}
		
		fis.close();
		
	}


}