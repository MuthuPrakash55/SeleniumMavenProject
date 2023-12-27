package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class excelDataSupllier {
	
	@DataProvider(name="login")
	public static String[][]getexceldata() throws Exception  {
		File file=new File("./src/test/java/practice/datasheet.xlsx");
		FileInputStream stream=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(stream);
		XSSFSheet sheet=wb.getSheet("sheet1");
		DataFormatter df=new DataFormatter();
		int row=sheet.getLastRowNum();
		int col=sheet.getRow(0).getLastCellNum();
		
		String[][]data=new String[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		wb.close();
		stream.close();
		return data;
	}
}
